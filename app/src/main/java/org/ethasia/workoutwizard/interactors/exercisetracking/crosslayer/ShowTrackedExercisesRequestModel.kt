package org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer

class ShowTrackedExercisesRequestModel private constructor(
    val exercises: List<String>){

    data class Builder(var exercises: MutableList<String> = arrayListOf<String>()) {

        fun addExercise(value: String) = apply { exercises.add(value) }
        fun build() = ShowTrackedExercisesRequestModel(exercises)
    }
}