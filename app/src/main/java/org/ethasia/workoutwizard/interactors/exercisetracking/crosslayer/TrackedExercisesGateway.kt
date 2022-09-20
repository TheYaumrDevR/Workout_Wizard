package org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer

import org.ethasia.workoutwizard.core.exercises.TrackedWorkout

interface TrackedExercisesGateway {

    fun findTrackedExercises(): List<TrackedWorkout>
}