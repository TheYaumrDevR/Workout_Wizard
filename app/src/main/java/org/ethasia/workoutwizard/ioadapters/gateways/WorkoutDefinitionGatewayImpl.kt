package org.ethasia.workoutwizard.ioadapters.gateways

import org.ethasia.workoutwizard.core.exercises.ExerciseBaseType
import org.ethasia.workoutwizard.core.exercises.ExerciseSetDefinition
import org.ethasia.workoutwizard.core.exercises.WorkoutCycleDefinition
import org.ethasia.workoutwizard.core.exercises.WorkoutDefinition
import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.WorkoutDefinitionGateway

class WorkoutDefinitionGatewayImpl : WorkoutDefinitionGateway {

    override fun findWorkoutCycleDefinition(): WorkoutCycleDefinition {
        val result = WorkoutCycleDefinition("Intermediate Home Workout")

        val pushWorkout = createPushWorkout()
        val pullWorkout = createPullWorkout()
        val legWorkout = createLegWorkout()
        val rotisserieWorkout = createRotisserieWorkout()

        result.addWorkoutDefinition(pushWorkout)
        result.addWorkoutDefinition(pullWorkout)
        result.addWorkoutDefinition(rotisserieWorkout)
        result.addWorkoutDefinition(legWorkout)
        result.addWorkoutDefinition(pushWorkout)
        result.addWorkoutDefinition(rotisserieWorkout)
        result.addWorkoutDefinition(pullWorkout)
        result.addWorkoutDefinition(legWorkout)
        result.addWorkoutDefinition(rotisserieWorkout)

        return result
    }

    private fun createPushWorkout(): WorkoutDefinition {
        val result = WorkoutDefinition("Push Workout")

        val pushups = ExerciseSetDefinition
            .Builder()
            .name("Pushups")
            .baseType(ExerciseBaseType.WITH_REPETITIONS)
            .build()
        val dumbbellFlies = ExerciseSetDefinition
            .Builder()
            .name("Dumbbell Flies")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        val skullCrushers = ExerciseSetDefinition
            .Builder()
            .name("Skull Crushers")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        val dumbbellShoulderPress = ExerciseSetDefinition
            .Builder()
            .name("Dumbbell Shoulder Press")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        val dumbbellLateralRaises = ExerciseSetDefinition
            .Builder()
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
        val result = WorkoutDefinition("Pull Workout")

        val pushups = ExerciseSetDefinition
            .Builder()
            .name("Pushups")
            .baseType(ExerciseBaseType.WITH_REPETITIONS)
            .build()
        val dumbbellReverseFlies = ExerciseSetDefinition
            .Builder()
            .name("Dumbbell Reverse Flies")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        val dumbbellCurls = ExerciseSetDefinition
            .Builder()
            .name("Dumbbell Curls")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        val barbellRows = ExerciseSetDefinition
            .Builder()
            .name("Barbell Rows")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        val hammerCurls = ExerciseSetDefinition
            .Builder()
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
        val result = WorkoutDefinition("Leg Workout")

        val dumbbellReverseFlies = ExerciseSetDefinition
            .Builder()
            .name("Dumbbell Reverse Flies")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        val lunges = ExerciseSetDefinition
            .Builder()
            .name("Lunges")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        val deadlifts = ExerciseSetDefinition
            .Builder()
            .name("Deadlifts")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        val squats = ExerciseSetDefinition
            .Builder()
            .name("Squats")
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .build()
        val calfRaises = ExerciseSetDefinition
            .Builder()
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
        val result = WorkoutDefinition("Rotisserie Workout")

        val rotisserieSetOne = ExerciseSetDefinition
            .Builder()
            .name("Rotisserie Set 1")
            .baseType(ExerciseBaseType.WITH_NOTHING)
            .build()
        val rotisserieSetTwo = ExerciseSetDefinition
            .Builder()
            .name("Rotisserie Set 2")
            .baseType(ExerciseBaseType.WITH_NOTHING)
            .build()

        result.addExerciseSetDefinitionWithExecutionAmount(rotisserieSetOne, 1)
        result.addExerciseSetDefinitionWithExecutionAmount(rotisserieSetTwo, 1)

        return result
    }
}