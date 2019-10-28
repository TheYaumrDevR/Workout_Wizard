package org.ethasia.workoutwizard.interactors

import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.PresentersFactory
import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.TrackedExercisesPresenter
import org.ethasia.workoutwizard.interactors.exercisetracking.tests.TrackedExercisesPresenterMock

class PresentersMockFactory : PresentersFactory() {

    override fun createTrackedExercisesPresenter(): TrackedExercisesPresenter {
        return TrackedExercisesPresenterMock()
    }
}