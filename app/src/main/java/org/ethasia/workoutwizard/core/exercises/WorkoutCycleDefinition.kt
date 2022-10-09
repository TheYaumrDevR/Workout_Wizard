package org.ethasia.workoutwizard.core.exercises

import java.util.*

class WorkoutCycleDefinition(val name: String) {

    val uniqueId = UUID.randomUUID().toString()

    private val workouts: MutableList<WorkoutDefinition> = mutableListOf<WorkoutDefinition>()

    fun addWorkoutDefinition(definition: WorkoutDefinition) {
        workouts.add(definition)
    }

    fun definitionsIterator(): Iterator<WorkoutDefinition> {
        return workouts.iterator()
    }
}