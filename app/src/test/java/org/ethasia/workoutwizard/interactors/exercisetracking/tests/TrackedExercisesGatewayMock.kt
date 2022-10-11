package org.ethasia.workoutwizard.interactors.exercisetracking.tests

import java.util.*

import org.ethasia.workoutwizard.core.exercises.ExerciseSetWithRepetitionsAndWeights
import org.ethasia.workoutwizard.core.exercises.TrackedWorkout
import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.TrackedExercisesGateway
import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.workouttracking.LastCompletedWorkoutAndSetIds

class TrackedExercisesGatewayMock : TrackedExercisesGateway {

    companion object {
        var findTrackedExercisesCallCount = 0
            private set

        fun resetMock() {
            findTrackedExercisesCallCount = 0
        }
    }

    override fun findTrackedExercises(): List<TrackedWorkout> {
        findTrackedExercisesCallCount++

        val setOne = ExerciseSetWithRepetitionsAndWeights.Builder()
            .weight(25f)
            .repetitionCount(8)
            .build()
        val setTwo = ExerciseSetWithRepetitionsAndWeights.Builder()
            .weight(25f)
            .repetitionCount(8)
            .build()
        val setThree = ExerciseSetWithRepetitionsAndWeights.Builder()
            .weight(25f)
            .repetitionCount(8)
            .build()
        val benchPress = TrackedWorkout.Builder()
            .name("Bench Press")
            .addExerciseSet(setOne)
            .addExerciseSet(setTwo)
            .addExerciseSet(setThree)
            .build()

        val setFour = ExerciseSetWithRepetitionsAndWeights.Builder()
            .weight(12.5f)
            .repetitionCount(8)
            .build()
        val setFive = ExerciseSetWithRepetitionsAndWeights.Builder()
            .weight(12.5f)
            .repetitionCount(8)
            .build()
        val setSix = ExerciseSetWithRepetitionsAndWeights.Builder()
            .weight(12.5f)
            .repetitionCount(8)
            .build()
        val dumbbellFly = TrackedWorkout.Builder()
            .name("Dumbbell Fly")
            .addExerciseSet(setFour)
            .addExerciseSet(setFive)
            .addExerciseSet(setSix)
            .build()

        return arrayListOf<TrackedWorkout>(benchPress, dumbbellFly)
    }

    override fun findLastCompletedSetsAndExercisesInformation(): LastCompletedWorkoutAndSetIds {
        return LastCompletedWorkoutAndSetIds("1", "1", "1")
    }
}