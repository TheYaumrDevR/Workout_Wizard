package org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer

import org.ethasia.workoutwizard.core.exercises.WorkoutCycleDefinition

interface WorkoutDefinitionGateway {

    fun findWorkoutCycleDefinition(): WorkoutCycleDefinition
}