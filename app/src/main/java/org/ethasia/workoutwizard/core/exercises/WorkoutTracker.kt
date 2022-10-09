package org.ethasia.workoutwizard.core.exercises

class WorkoutTracker {

    lateinit var trackedWorkout: TrackedWorkout
        private set

    fun startWorkoutFromWorkoutDefinition(definition: WorkoutDefinition) {
        val trackedWorkoutBuilder = TrackedWorkout.Builder()
        trackedWorkoutBuilder.name(definition.name)
        trackedWorkoutBuilder.uniqueId(definition.uniqueId)

        initializeExerciseSets(definition, trackedWorkoutBuilder)
        
        trackedWorkout = trackedWorkoutBuilder.build()
    }

    private fun initializeExerciseSets(definition: WorkoutDefinition, trackedWorkoutBuilder: TrackedWorkout.Builder) {
        val exerciseSets = createExerciseSets(definition, 0)
        for (exerciseSet in exerciseSets) {
            trackedWorkoutBuilder.addExerciseSet(exerciseSet)
        }
    }

    private fun createExerciseSets(definition: WorkoutDefinition, recursionDepth: Int): MutableList<ExerciseSet> {
        val result: MutableList<ExerciseSet> = arrayListOf<ExerciseSet>()

        var continueRecursion = false
        definition.definitionsIterator().forEach {
            if (it.executionAmount - recursionDepth > 0) {
                val exerciseSet = createExerciseSetFromDefinition(it.exerciseSetDefinition)
                result.add(exerciseSet)

                continueRecursion = true
            }
        }

        if (continueRecursion) {
            result.addAll(createExerciseSets(definition, recursionDepth + 1))
        }

        return result
    }

    private fun createExerciseSetFromDefinition(exerciseSetDefinition: ExerciseSetDefinition): ExerciseSet {
        return when (exerciseSetDefinition.baseType) {
            ExerciseBaseType.WITH_NOTHING -> ExerciseSetWithoutRepetitionsAndWeights.Builder()
                .name(exerciseSetDefinition.name)
                .uniqueId(exerciseSetDefinition.uniqueId)
                .build()

            ExerciseBaseType.WITH_REPETITIONS -> ExerciseSetWithRepetitions.Builder()
                .name(exerciseSetDefinition.name)
                .uniqueId(exerciseSetDefinition.uniqueId)
                .build()

            ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS -> ExerciseSetWithRepetitionsAndWeights.Builder()
                .name(exerciseSetDefinition.name)
                .uniqueId(exerciseSetDefinition.uniqueId)
                .build()
        }
    }
}