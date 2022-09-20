package org.ethasia.workoutwizard.core.exercises

class ExerciseSetWithoutRepetitionsAndWeights private constructor(override val name: String) : ExerciseSet {

    override fun getBaseType(): ExerciseBaseType {
        return ExerciseBaseType.WITH_NOTHING
    }

    data class Builder(var name: String = "") {

        fun name(value: String) = apply { name = value }
        fun build() = ExerciseSetWithoutRepetitionsAndWeights(name)
    }
}