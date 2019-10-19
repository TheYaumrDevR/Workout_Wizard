package org.ethasia.workoutwizard.interactors.exercisetracking.tests

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.assertThat
import org.junit.Test

import org.ethasia.workoutwizard.interactors.exercisetracking.ShowTrackedExercisesUseCaseImpl

class ShowTrackedExercisesUseCaseTest {

    @Test
    fun testShowTrackedExercises() {
        val testCandidate = ShowTrackedExercisesUseCaseImpl()
        testCandidate.showTrackedExercises()
    }
}