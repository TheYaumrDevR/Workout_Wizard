package org.ethasia.workoutwizard.core.exercises.tests

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.assertThat
import org.junit.Test

import org.ethasia.workoutwizard.core.exercises.ExerciseBaseType
import org.ethasia.workoutwizard.core.exercises.ExerciseSetDefinition
import org.ethasia.workoutwizard.core.exercises.WorkoutDefinition
import org.ethasia.workoutwizard.core.exercises.WorkoutTracker

class WorkoutTrackerTest {

    @Test
    fun testWorkoutIsCorrectlyCreatedFromWorkoutDefinition() {
        val testCandidate = WorkoutTracker()

        val workoutDefinition = WorkoutDefinition("Push Workout")

        val setOne: ExerciseSetDefinition = ExerciseSetDefinition.Builder()
            .baseType(ExerciseBaseType.WITH_REPETITIONS)
            .name("Pushups")
            .build()

        val setTwo: ExerciseSetDefinition = ExerciseSetDefinition.Builder()
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .name("Dumbbell Flies")
            .build()

        val setThree: ExerciseSetDefinition = ExerciseSetDefinition.Builder()
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .name("Skull Crushers")
            .build()

        workoutDefinition.addExerciseSetDefinitionWithExecutionAmount(setOne, 1)
        workoutDefinition.addExerciseSetDefinitionWithExecutionAmount(setTwo, 3)
        workoutDefinition.addExerciseSetDefinitionWithExecutionAmount(setThree, 3)

        testCandidate.startWorkoutFromWorkoutDefinition(workoutDefinition)

        val createdWorkout = testCandidate.trackedWorkout

        assertThat(createdWorkout.sets.size, `is`(equalTo(7)))
        assertThat(createdWorkout.name, `is`(equalTo("Push Workout")))

        assertThat(createdWorkout.sets[0].name, `is`(equalTo("Pushups")))
        assertThat(createdWorkout.sets[1].name, `is`(equalTo("Dumbbell Flies")))
        assertThat(createdWorkout.sets[2].name, `is`(equalTo("Skull Crushers")))
        assertThat(createdWorkout.sets[3].name, `is`(equalTo("Dumbbell Flies")))
        assertThat(createdWorkout.sets[4].name, `is`(equalTo("Skull Crushers")))
        assertThat(createdWorkout.sets[5].name, `is`(equalTo("Dumbbell Flies")))
        assertThat(createdWorkout.sets[6].name, `is`(equalTo("Skull Crushers")))

        assertThat(createdWorkout.sets[0].getBaseType(), `is`(equalTo(ExerciseBaseType.WITH_REPETITIONS)))
        assertThat(createdWorkout.sets[1].getBaseType(), `is`(equalTo(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)))
        assertThat(createdWorkout.sets[2].getBaseType(), `is`(equalTo(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)))
        assertThat(createdWorkout.sets[3].getBaseType(), `is`(equalTo(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)))
        assertThat(createdWorkout.sets[4].getBaseType(), `is`(equalTo(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)))
        assertThat(createdWorkout.sets[5].getBaseType(), `is`(equalTo(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)))
        assertThat(createdWorkout.sets[6].getBaseType(), `is`(equalTo(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)))
    }
}