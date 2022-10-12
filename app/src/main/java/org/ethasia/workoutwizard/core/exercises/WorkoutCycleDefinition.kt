package org.ethasia.workoutwizard.core.exercises

class WorkoutCycleDefinition(val name: String) {

    val uniqueId = "97f3f2e7-4805-4c4b-9f2f-bd6e2674fe09"

    private val workouts: MutableList<WorkoutDefinition> = mutableListOf<WorkoutDefinition>()

    fun addWorkoutDefinition(definition: WorkoutDefinition) {
        workouts.add(definition)
    }

    fun definitionsIterator(): Iterator<WorkoutDefinition> {
        return workouts.iterator()
    }
}