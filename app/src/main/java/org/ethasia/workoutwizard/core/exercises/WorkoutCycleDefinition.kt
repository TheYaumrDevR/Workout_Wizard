package org.ethasia.workoutwizard.core.exercises

class WorkoutCycleDefinition(val name: String) {

    private val containedSets: MutableList<ExerciseSetDefinition> = mutableListOf<ExerciseSetDefinition>()

    fun addExerciseSetDefinition(definition: ExerciseSetDefinition) {
        containedSets.add(definition)
    }

    fun definitionsIterator(): Iterator<ExerciseSetDefinition> {
        return containedSets.iterator()
    }
}