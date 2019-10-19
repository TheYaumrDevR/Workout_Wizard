package org.ethasia.workoutwizard.interactors

import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.GatewaysFactory
import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.TrackedExercisesGateway
import org.ethasia.workoutwizard.interactors.exercisetracking.tests.TrackedExercisesGatewayMock

class GatewaysMockFactory : GatewaysFactory() {

    override fun createTrackedExercisesGateway(): TrackedExercisesGateway {
        return TrackedExercisesGatewayMock()
    }
}