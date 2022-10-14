package org.ethasia.workoutwizard.ioadapters.gateways

import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.GatewaysFactory
import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.TrackedExercisesGateway
import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.WorkoutDefinitionGateway

class RealGatewaysFactory : GatewaysFactory() {

    override fun createTrackedExercisesGateway(): TrackedExercisesGateway {
        return TrackedExercisesGatewayImpl()
    }

    override fun createWorkoutDefinitionGateway(): WorkoutDefinitionGateway {
        return WorkoutDefinitionGatewayImpl()
    }
}