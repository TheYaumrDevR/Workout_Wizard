package org.ethasia.workoutwizard.ioadapters.gateways

import org.ethasia.workoutwizard.core.exercises.ExerciseBaseType
import org.ethasia.workoutwizard.core.exercises.ExerciseSetDefinition
import org.ethasia.workoutwizard.core.exercises.WorkoutCycleDefinition
import org.ethasia.workoutwizard.core.exercises.WorkoutDefinition
import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.WorkoutDefinitionGateway

class WorkoutDefinitionGatewayImpl : WorkoutDefinitionGateway {

    private val uuidProvider = UuidProvider()

    override fun findWorkoutCycleDefinitionById(uniqueId: String): WorkoutCycleDefinition {
        val result = WorkoutCycleDefinition("Intermediate Home Workout")

        val pushWorkout1 = createPushWorkout()
        val pullWorkout1 = createPullWorkout()
        val legWorkout1 = createLegWorkout()
        val pushWorkout2 = createPushWorkout()
        val pullWorkout2 = createPullWorkout()
        val legWorkout2 = createLegWorkout()
        val rotisserieWorkout1 = createRotisserieWorkout()
        val rotisserieWorkout2 = createRotisserieWorkout()
        val rotisserieWorkout3 = createRotisserieWorkout()

        result.addWorkoutDefinition(pushWorkout1)
        result.addWorkoutDefinition(pullWorkout1)
        result.addWorkoutDefinition(rotisserieWorkout1)
        result.addWorkoutDefinition(legWorkout1)
        result.addWorkoutDefinition(pushWorkout2)
        result.addWorkoutDefinition(rotisserieWorkout2)
        result.addWorkoutDefinition(pullWorkout2)
        result.addWorkoutDefinition(legWorkout2)
        result.addWorkoutDefinition(rotisserieWorkout3)

        return result
    }

    private fun createPushWorkout(): WorkoutDefinition {
        val result = WorkoutDefinition("Push Workout", uuidProvider.getNextWorkoutUuid())

        val pushups = ExerciseSetDefinition
            .Builder()
            .uniqueId(uuidProvider.getNextSetId())
            .name("Pushups")
            .baseType(ExerciseBaseType.WITH_REPETITIONS)
            .build()
        val dumbbellFlies = ExerciseSetDefinition
            .Builder()
            .uniqueId(uuidProvider.getNextSetId())
            .name("Dumbbell Flies")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        val skullCrushers = ExerciseSetDefinition
            .Builder()
            .uniqueId(uuidProvider.getNextSetId())
            .name("Skull Crushers")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        val dumbbellShoulderPress = ExerciseSetDefinition
            .Builder()
            .uniqueId(uuidProvider.getNextSetId())
            .name("Dumbbell Shoulder Press")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        val dumbbellLateralRaises = ExerciseSetDefinition
            .Builder()
            .uniqueId(uuidProvider.getNextSetId())
            .name("Dumbbell Lateral Raise")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        result.addExerciseSetDefinitionWithExecutionAmount(pushups, 1)
        result.addExerciseSetDefinitionWithExecutionAmount(dumbbellFlies, 3)
        result.addExerciseSetDefinitionWithExecutionAmount(skullCrushers, 3)
        result.addExerciseSetDefinitionWithExecutionAmount(dumbbellShoulderPress, 3)
        result.addExerciseSetDefinitionWithExecutionAmount(dumbbellLateralRaises, 3)

        return result
    }

    private fun createPullWorkout(): WorkoutDefinition {
        val result = WorkoutDefinition("Pull Workout", uuidProvider.getNextWorkoutUuid())

        val pushups = ExerciseSetDefinition
            .Builder()
            .uniqueId(uuidProvider.getNextSetId())
            .name("Pushups")
            .baseType(ExerciseBaseType.WITH_REPETITIONS)
            .build()
        val dumbbellReverseFlies = ExerciseSetDefinition
            .Builder()
            .uniqueId(uuidProvider.getNextSetId())
            .name("Dumbbell Reverse Flies")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        val dumbbellCurls = ExerciseSetDefinition
            .Builder()
            .uniqueId(uuidProvider.getNextSetId())
            .name("Dumbbell Curls")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        val barbellRows = ExerciseSetDefinition
            .Builder()
            .uniqueId(uuidProvider.getNextSetId())
            .name("Barbell Rows")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        val hammerCurls = ExerciseSetDefinition
            .Builder()
            .uniqueId(uuidProvider.getNextSetId())
            .name("Hammer Curls")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        result.addExerciseSetDefinitionWithExecutionAmount(pushups, 1)
        result.addExerciseSetDefinitionWithExecutionAmount(dumbbellReverseFlies, 3)
        result.addExerciseSetDefinitionWithExecutionAmount(dumbbellCurls, 3)
        result.addExerciseSetDefinitionWithExecutionAmount(barbellRows, 3)
        result.addExerciseSetDefinitionWithExecutionAmount(hammerCurls, 3)

        return result
    }

    private fun createLegWorkout(): WorkoutDefinition {
        val result = WorkoutDefinition("Leg Workout", uuidProvider.getNextWorkoutUuid())

        val dumbbellReverseFlies = ExerciseSetDefinition
            .Builder()
            .uniqueId(uuidProvider.getNextSetId())
            .name("Dumbbell Reverse Flies")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        val lunges = ExerciseSetDefinition
            .Builder()
            .uniqueId(uuidProvider.getNextSetId())
            .name("Lunges")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        val deadlifts = ExerciseSetDefinition
            .Builder()
            .uniqueId(uuidProvider.getNextSetId())
            .name("Deadlifts")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        val squats = ExerciseSetDefinition
            .Builder()
            .uniqueId(uuidProvider.getNextSetId())
            .name("Squats")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        val calfRaises = ExerciseSetDefinition
            .Builder()
            .uniqueId(uuidProvider.getNextSetId())
            .name("Calf Raises")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        result.addExerciseSetDefinitionWithExecutionAmount(dumbbellReverseFlies, 1)
        result.addExerciseSetDefinitionWithExecutionAmount(lunges, 3)
        result.addExerciseSetDefinitionWithExecutionAmount(deadlifts, 3)
        result.addExerciseSetDefinitionWithExecutionAmount(squats, 3)
        result.addExerciseSetDefinitionWithExecutionAmount(calfRaises, 3)

        return result
    }

    private fun createRotisserieWorkout(): WorkoutDefinition {
        val result = WorkoutDefinition("Rotisserie Workout", uuidProvider.getNextWorkoutUuid())

        val rotisserieSetOne = ExerciseSetDefinition
            .Builder()
            .uniqueId(uuidProvider.getNextSetId())
            .name("Rotisserie Set 1")
            .baseType(ExerciseBaseType.WITH_NOTHING)
            .build()
        val rotisserieSetTwo = ExerciseSetDefinition
            .Builder()
            .uniqueId(uuidProvider.getNextSetId())
            .name("Rotisserie Set 2")
            .baseType(ExerciseBaseType.WITH_NOTHING)
            .build()

        result.addExerciseSetDefinitionWithExecutionAmount(rotisserieSetOne, 1)
        result.addExerciseSetDefinitionWithExecutionAmount(rotisserieSetTwo, 1)

        return result
    }
}