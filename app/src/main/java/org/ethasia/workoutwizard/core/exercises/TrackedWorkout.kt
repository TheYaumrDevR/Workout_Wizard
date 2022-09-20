package org.ethasia.workoutwizard.core.exercises

class TrackedWorkout private constructor(
    val name: String,
    val sets: List<ExerciseSet>) {

    data class Builder(var name: String = "",
                       var exerciseSets: MutableList<ExerciseSet> = arrayListOf<ExerciseSet>()
    ) {

        fun name(value: String) = apply { name = value }
        fun addExerciseSet(value: ExerciseSet) = apply { exerciseSets.add(value) }
        fun build() = TrackedWorkout(name, exerciseSets.toList())
    }
}