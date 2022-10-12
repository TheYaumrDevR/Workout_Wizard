package org.ethasia.workoutwizard.ioadapters.gateways

import org.ethasia.workoutwizard.core.exercises.TrackedWorkout
import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.TrackedExercisesGateway
import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.workouttracking.LastCompletedWorkoutAndSetIds

class TrackedExercisesGatewayImpl : TrackedExercisesGateway {

    override fun findLastCompletedSetsAndExercisesInformation(): LastCompletedWorkoutAndSetIds {
        return LastCompletedWorkoutAndSetIds("97f3f2e7-4805-4c4b-9f2f-bd6e2674fe09", "0", "0")
    }

    override fun findTrackedExercises(): List<TrackedWorkout> {
        return listOf()
    }

}