package org.ethasia.workoutwizard.interactors.exercisetracking

import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.GatewaysFactory

class ShowTrackedExercisesUseCaseImpl {

    private val trackedExercisesGateway = GatewaysFactory.instance?.createTrackedExercisesGateway()

    fun showTrackedExercises() {
        trackedExercisesGateway?.findTrackedExercises()
    }
}