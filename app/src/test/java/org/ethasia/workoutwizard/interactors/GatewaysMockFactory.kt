package org.ethasia.workoutwizard.interactors

import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.GatewaysFactory
import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.TrackedExercisesGateway
import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.WorkoutDefinitionGateway
import org.ethasia.workoutwizard.interactors.exercisetracking.tests.TrackedExercisesGatewayMock
import org.ethasia.workoutwizard.interactors.exercisetracking.tests.WorkoutDefinitionGatewayMock

class GatewaysMockFactory : GatewaysFactory() {

    override fun createTrackedExercisesGateway(): TrackedExercisesGateway {
        return TrackedExercisesGatewayMock()
    }

    override fun createWorkoutDefinitionGateway(): WorkoutDefinitionGateway {
        return WorkoutDefinitionGatewayMock()
    }
}