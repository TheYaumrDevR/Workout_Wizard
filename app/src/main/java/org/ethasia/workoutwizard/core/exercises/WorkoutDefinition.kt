package org.ethasia.workoutwizard.core.exercises

import java.util.*

class WorkoutDefinition(val name: String) {

    val uniqueId = UUID.randomUUID().toString()

    private val containedSets: MutableList<ExerciseSetWithExecutionAmount> = mutableListOf<ExerciseSetWithExecutionAmount>()

    fun addExerciseSetDefinitionWithExecutionAmount(definition: ExerciseSetDefinition, executionAmount: Int) {
        val exerciseSetDefinitionWithExecutionAmount = ExerciseSetWithExecutionAmount(definition, executionAmount)
        containedSets.add(exerciseSetDefinitionWithExecutionAmount)
    }

    fun definitionsIterator(): Iterator<ExerciseSetWithExecutionAmount> {
        return containedSets.iterator()
    }

    class ExerciseSetWithExecutionAmount(val exerciseSetDefinition: ExerciseSetDefinition, val executionAmount: Int)
}