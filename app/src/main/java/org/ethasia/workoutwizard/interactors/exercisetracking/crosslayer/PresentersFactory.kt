package org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer

abstract class PresentersFactory {
    companion object {
        var instance: PresentersFactory? = null
    }

    abstract fun createTrackedExercisesPresenter(): TrackedExercisesPresenter
}