package org.ethasia.workoutwizard.core.exercises

class ExerciseSetWithRepetitionsAndWeights private constructor(
    val weight: Float,
    val repetitionCount: Int,
    override val name: String,
    override val uniqueId: String) : ExerciseSet {

    override fun getBaseType(): ExerciseBaseType {
        return ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS
    }

    data class Builder(var weight: Float = 0.0f,
                       var repetitionCount: Int = 0,
                       var name: String = "",
                       var uniqueId: String = "") {

        fun weight(value: Float) = apply { weight = value }
        fun repetitionCount(value: Int) = apply { repetitionCount = value }
        fun name(value: String) = apply { name = value }
        fun uniqueId(value: String) = apply { uniqueId = value }
        fun build() = ExerciseSetWithRepetitionsAndWeights(weight, repetitionCount, name, uniqueId)
    }
}