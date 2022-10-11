package org.ethasia.workoutwizard.interactors.exercisetracking.tests

import org.ethasia.workoutwizard.core.exercises.WorkoutCycleDefinition
import org.ethasia.workoutwizard.core.exercises.tests.WorkoutCycleDefinitionTest
import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.WorkoutDefinitionGateway

class WorkoutDefinitionGatewayMock: WorkoutDefinitionGateway {

    override fun findWorkoutCycleDefinitionById(uniqueId: String): WorkoutCycleDefinition {
        return WorkoutCycleDefinition("Mock Workout Cycle")
    }
}