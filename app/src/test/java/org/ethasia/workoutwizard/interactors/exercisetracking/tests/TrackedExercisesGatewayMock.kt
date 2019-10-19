package org.ethasia.workoutwizard.interactors.exercisetracking.tests

import java.util.*

import org.ethasia.workoutwizard.core.exercises.ExerciseSet
import org.ethasia.workoutwizard.core.exercises.TrackedExercise
import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.TrackedExercisesGateway

class TrackedExercisesGatewayMock : TrackedExercisesGateway {

    companion object {
        var findTrackedExercisesCallCount = 0
            private set

        fun resetMock() {
            findTrackedExercisesCallCount = 0
        }
    }

    override fun findTrackedExercises(): List<TrackedExercise> {
        findTrackedExercisesCallCount++

        val testDate = Date()

        val setOne = ExerciseSet.Builder()
            .weight(25f)
            .repetitionCount(8)
            .performDate(testDate)
            .build()
        val setTwo = ExerciseSet.Builder()
            .weight(25f)
            .repetitionCount(8)
            .performDate(testDate)
            .build()
        val setThree = ExerciseSet.Builder()
            .weight(25f)
            .repetitionCount(8)
            .performDate(testDate)
            .build()
        val benchPress = TrackedExercise.Builder()
            .name("Bench Press")
            .addExerciseSet(setOne)
            .addExerciseSet(setTwo)
            .addExerciseSet(setThree)
            .build()

        val setFour = ExerciseSet.Builder()
            .weight(12.5f)
            .repetitionCount(8)
            .performDate(testDate)
            .build()
        val setFive = ExerciseSet.Builder()
            .weight(12.5f)
            .repetitionCount(8)
            .performDate(testDate)
            .build()
        val setSix = ExerciseSet.Builder()
            .weight(12.5f)
            .repetitionCount(8)
            .performDate(testDate)
            .build()
        val dumbbellFly = TrackedExercise.Builder()
            .name("Dumbbell Fly")
            .addExerciseSet(setFour)
            .addExerciseSet(setFive)
            .addExerciseSet(setSix)
            .build()

        return arrayListOf<TrackedExercise>(benchPress, dumbbellFly)
    }
}