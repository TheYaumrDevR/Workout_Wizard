package org.ethasia.workoutwizard.core.exercises

class ExerciseSetWithRepetitions private constructor(
    val repetitionCount: Int,
    override val name: String,
    override val uniqueId: String) : ExerciseSet {


    override fun getBaseType(): ExerciseBaseType {
        return ExerciseBaseType.WITH_REPETITIONS
    }

    data class Builder(var repetitionCount: Int = 0,
                       var name: String = "",
                       var uniqueId: String = "") {

        fun repetitionCount(value: Int) = apply { repetitionCount = value }
        fun name(value: String) = apply { name = value }
        fun uniqueId(value: String) = apply { uniqueId = value }
        fun build() = ExerciseSetWithRepetitions(repetitionCount, name, uniqueId)
    }
}