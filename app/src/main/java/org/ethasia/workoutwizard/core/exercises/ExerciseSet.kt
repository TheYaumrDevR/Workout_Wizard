package org.ethasia.workoutwizard.core.exercises

interface ExerciseSet {
    val uniqueId: String
    val name: String

    fun getBaseType(): ExerciseBaseType
}