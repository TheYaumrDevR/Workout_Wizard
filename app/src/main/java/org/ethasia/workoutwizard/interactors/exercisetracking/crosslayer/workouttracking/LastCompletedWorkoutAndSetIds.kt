package org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.workouttracking

data class LastCompletedWorkoutAndSetIds(
    val trackedWorkoutCycleId: String,
    val trackedWorkoutId: String,
    val trackedSetId: String)