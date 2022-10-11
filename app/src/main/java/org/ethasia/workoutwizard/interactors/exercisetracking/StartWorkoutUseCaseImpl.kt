package org.ethasia.workoutwizard.interactors.exercisetracking

import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.GatewaysFactory

class StartWorkoutUseCaseImpl {

    private val trackedExercisesGateway = GatewaysFactory.instance?.createTrackedExercisesGateway()
    private val workoutDefinitionGateway = GatewaysFactory.instance?.createWorkoutDefinitionGateway()

    fun startWorkout() {
        val lastCompletedExerciseInformation = trackedExercisesGateway?.findLastCompletedSetsAndExercisesInformation()
        val trackedWorkoutCycleDefinition = workoutDefinitionGateway?.findWorkoutCycleDefinitionById(lastCompletedExerciseInformation!!.trackedWorkoutCycleId)
        // Start the workout based on this cycle definition
    }
}