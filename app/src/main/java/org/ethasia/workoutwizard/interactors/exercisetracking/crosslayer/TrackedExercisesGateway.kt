package org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer

import org.ethasia.workoutwizard.core.exercises.TrackedExercise

interface TrackedExercisesGateway {

    fun findTrackedExercises(): List<TrackedExercise>
}