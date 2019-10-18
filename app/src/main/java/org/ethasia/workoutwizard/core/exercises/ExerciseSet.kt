package org.ethasia.workoutwizard.core.exercises

import java.util.Date

class ExerciseSet private constructor(
        val weight: Float,
        val repetitionCount: Int,
        val performDate: Date
    ) {

    data class Builder(var weight: Float = 0.0f,
                       var repetitionCount: Int = 0,
                       var performDate: Date = Date()) {

        fun weight(value: Float) = apply { weight = value }
        fun repetitionCount(value: Int) = apply { repetitionCount = value }
        fun performDate(value: Date) = apply { performDate = value }
        fun build() = ExerciseSet(weight, repetitionCount, performDate)
    }
}