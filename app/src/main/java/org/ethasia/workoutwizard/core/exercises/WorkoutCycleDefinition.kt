package org.ethasia.workoutwizard.core.exercises

class WorkoutCycleDefinition(val name: String) {

    private val workouts: MutableList<WorkoutDefinition> = mutableListOf<WorkoutDefinition>()

    fun addWorkoutDefinition(definition: WorkoutDefinition) {
        workouts.add(definition)
    }

    fun definitionsIterator(): Iterator<WorkoutDefinition> {
        return workouts.iterator()
    }
}