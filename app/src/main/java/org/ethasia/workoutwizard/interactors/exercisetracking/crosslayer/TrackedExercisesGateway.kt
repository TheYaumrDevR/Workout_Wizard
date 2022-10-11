package org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer

import org.ethasia.workoutwizard.core.exercises.TrackedWorkout
import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.workouttracking.LastCompletedWorkoutAndSetIds

interface TrackedExercisesGateway {

    fun findLastCompletedSetsAndExercisesInformation(): LastCompletedWorkoutAndSetIds
    fun findTrackedExercises(): List<TrackedWorkout>
}