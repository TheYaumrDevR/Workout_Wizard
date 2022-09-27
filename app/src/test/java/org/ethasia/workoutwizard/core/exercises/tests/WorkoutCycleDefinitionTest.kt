package org.ethasia.workoutwizard.core.exercises.tests

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.assertThat
import org.junit.Test

import org.ethasia.workoutwizard.core.exercises.ExerciseBaseType
import org.ethasia.workoutwizard.core.exercises.ExerciseSetDefinition
import org.ethasia.workoutwizard.core.exercises.WorkoutCycleDefinition
import org.ethasia.workoutwizard.core.exercises.WorkoutDefinition

class WorkoutCycleDefinitionTest {

    @Test
    fun testItearatorReturnsPreviouslyAddedWorkouts() {
        val testCandidate = WorkoutCycleDefinition("Homeworkout Intermediate")

        val workoutOne = WorkoutDefinition("Push Workout")
        val setOne: ExerciseSetDefinition = ExerciseSetDefinition.Builder()
            .baseType(ExerciseBaseType.WITH_REPETITIONS)
            .name("Pushups")
            .build()
        workoutOne.addExerciseSetDefinitionWithExecutionAmount(setOne, 3)

        val workoutTwo = WorkoutDefinition("Pull Workout")
        val setTwo: ExerciseSetDefinition = ExerciseSetDefinition.Builder()
            .baseType(ExerciseBaseType.WITH_REPETITIONS)
            .name("Pullups")
            .build()
        workoutTwo.addExerciseSetDefinitionWithExecutionAmount(setTwo, 3)

        val workoutThree = WorkoutDefinition("Abs Workout")
        val setThree: ExerciseSetDefinition = ExerciseSetDefinition.Builder()
            .baseType(ExerciseBaseType.WITH_REPETITIONS)
            .name("Situps")
            .build()
        workoutThree.addExerciseSetDefinitionWithExecutionAmount(setThree, 3)

        testCandidate.addWorkoutDefinition(workoutOne)
        testCandidate.addWorkoutDefinition(workoutTwo)
        testCandidate.addWorkoutDefinition(workoutThree)

        val controlList = listOf(workoutOne, workoutTwo, workoutThree)
        val controlIterator = controlList.iterator()

        val workoutsIterator = testCandidate.definitionsIterator()

        assertThat(testCandidate.name, `is`(equalTo("Homeworkout Intermediate")))
        while (workoutsIterator.hasNext() || controlIterator.hasNext()) {
            val nextActualWorkoutDefinition = workoutsIterator.next()
            assertThat(nextActualWorkoutDefinition, `is`(equalTo(controlIterator.next())))
        }
    }
}