package org.ethasia.workoutwizard.core.exercises

interface ExerciseSet {
    val name: String

    fun getBaseType(): ExerciseBaseType
}