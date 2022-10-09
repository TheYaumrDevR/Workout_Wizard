package org.ethasia.workoutwizard.core.exercises

class TrackedWorkout private constructor(
    val name: String,
    val sets: List<ExerciseSet>,
    val uniqueId: String) {

    data class Builder(var name: String = "",
                       var exerciseSets: MutableList<ExerciseSet> = arrayListOf<ExerciseSet>(),
                       var uniqueId: String = ""
    ) {

        fun uniqueId(value: String) = apply { uniqueId = value }
        fun name(value: String) = apply { name = value }
        fun addExerciseSet(value: ExerciseSet) = apply { exerciseSets.add(value) }
        fun build() = TrackedWorkout(name, exerciseSets.toList(), uniqueId)
    }
}