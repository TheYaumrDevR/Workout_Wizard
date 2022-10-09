package org.ethasia.workoutwizard.core.exercises

import java.util.*

class ExerciseSetDefinition private constructor(val baseType: ExerciseBaseType, val name: String) {

    val uniqueId = UUID.randomUUID().toString()

    data class Builder(
        var baseType: ExerciseBaseType = ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS,
        var name: String = "") {

        fun baseType(value: ExerciseBaseType) = apply { baseType = value }
        fun name(value: String) = apply { name = value }
        fun build() = ExerciseSetDefinition(baseType, name)
    }
}