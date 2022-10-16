package org.ethasia.workoutwizard.ioadapters.gateways

import org.ethasia.workoutwizard.core.exercises.TrackedWorkout
import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.TrackedExercisesGateway
import org.ethasia.workoutwizard.interactors.exercisetracking.crosslayer.workouttracking.LastCompletedWorkoutAndSetIds
import org.ethasia.workoutwizard.ioadapters.gateways.crosslayer.PersistenceFactory

class TrackedExercisesGatewayImpl : TrackedExercisesGateway {

    val appSpecificStorageAccessor = PersistenceFactory.instance?.createAppSpecificStorageAccessor()

    override fun findLastCompletedSetsAndExercisesInformation(): LastCompletedWorkoutAndSetIds {
        return LastCompletedWorkoutAndSetIds("97f3f2e7-4805-4c4b-9f2f-bd6e2674fe09", "0", "0")
    }

    override fun saveLastCompletedSetsAndExercisesInformation(toSave: LastCompletedWorkoutAndSetIds) {
        val fileContent = toSave.trackedWorkoutCycleId + "," + toSave.trackedWorkoutId + "," + toSave.trackedSetId
        val fileName = "LastExecutedWorkout"

        appSpecificStorageAccessor?.saveFileInAppSpecificStorage(fileName, fileContent)
    }

    override fun findTrackedExercises(): List<TrackedWorkout> {
        return listOf()
    }

}