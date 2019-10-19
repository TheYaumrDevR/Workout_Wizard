package org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer

abstract class GatewaysFactory {

    companion object {
        var instance: GatewaysFactory? = null
    }

    abstract fun createTrackedExercisesGateway(): TrackedExercisesGateway
}