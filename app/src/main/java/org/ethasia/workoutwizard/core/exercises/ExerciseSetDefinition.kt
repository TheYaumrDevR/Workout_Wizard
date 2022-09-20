package org.ethasia.workoutwizard.core.exercises

class ExerciseSetDefinition private constructor(val baseType: ExerciseBaseType, val name: String) {

    data class Builder(
        var baseType: ExerciseBaseType = ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS,
        var name: String = "") {

        fun baseType(value: ExerciseBaseType) = apply { baseType = value }
        fun name(value: String) = apply { name = value }
        fun build() = ExerciseSetDefinition(baseType, name)
    }
}