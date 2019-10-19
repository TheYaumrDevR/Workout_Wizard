package org.ethasia.workoutwizard.interactors.exercisetracking.tests

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test

import org.ethasia.workoutwizard.interactors.GatewaysMockFactory
import org.ethasia.workoutwizard.interactors.exercisetracking.ShowTrackedExercisesUseCaseImpl
import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.GatewaysFactory

class ShowTrackedExercisesUseCaseTest {

    companion object {
        init {
            GatewaysFactory.instance = GatewaysMockFactory()
        }
    }

    @Before
    fun resetSharedState() {
        TrackedExercisesGatewayMock.resetMock()
    }

    @Test
    fun testShowTrackedExercises() {
        val testCandidate = ShowTrackedExercisesUseCaseImpl()
        testCandidate.showTrackedExercises()

        assertThat(TrackedExercisesGatewayMock.findTrackedExercisesCallCount, `is`(equalTo(1)))
    }
}