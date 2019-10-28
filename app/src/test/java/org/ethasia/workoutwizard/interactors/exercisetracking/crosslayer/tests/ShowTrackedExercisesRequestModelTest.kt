package org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.tests

import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.ShowTrackedExercisesRequestModel

import org.hamcrest.CoreMatchers.hasItems
import org.junit.Assert.assertThat
import org.junit.Test

class ShowTrackedExercisesRequestModelTest {

    @Test
    fun testBuild_addsTwoExercises_arePresentInProduct() {
        val testRequestModel = ShowTrackedExercisesRequestModel.Builder()
            .addExercise("Squat")
            .addExercise("Deadlift")
            .build()

        assertThat(testRequestModel.exercises, hasItems("Squat", "Deadlift"))
    }
}