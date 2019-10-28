package org.ethasia.workoutwizard.interactors.exercisetracking.tests

import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.ShowTrackedExercisesRequestModel
import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.TrackedExercisesPresenter

class TrackedExercisesPresenterMock : TrackedExercisesPresenter {

    companion object {
        var showTrackedExercisesOverviewCallCount = 0
            private set

        var lastShowTrackedExercisesOverviewParameter: ShowTrackedExercisesRequestModel? = null
            private set

        fun resetMock() {
            showTrackedExercisesOverviewCallCount = 0
            lastShowTrackedExercisesOverviewParameter = null
        }
    }

    override fun showTrackedExercisesOverview(trackedExercisesRequestModel: ShowTrackedExercisesRequestModel) {
        lastShowTrackedExercisesOverviewParameter = trackedExercisesRequestModel
        showTrackedExercisesOverviewCallCount++
    }
}