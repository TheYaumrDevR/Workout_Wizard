package org.ethasia.workoutwizard.core.exercises.tests

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.assertThat
import org.junit.Test

import org.ethasia.workoutwizard.core.exercises.ExerciseBaseType
import org.ethasia.workoutwizard.core.exercises.ExerciseSetDefinition
import org.ethasia.workoutwizard.core.exercises.WorkoutDefinition

class WorkoutDefinitionTest {

    @Test
    fun testIteratorReturnsPreviouslyAddedExerciseSets() {
        val testCandidate = WorkoutDefinition("Push Workout")

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

        val setFour: ExerciseSetDefinition = ExerciseSetDefinition.Builder()
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .name("Dumbbell Shoulder Press")
            .build()

        val setFive: ExerciseSetDefinition = ExerciseSetDefinition.Builder()
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .name("Skull Lateral Raise")
            .build()

        testCandidate.addExerciseSetDefinitionWithExecutionAmount(setOne, 1)
        testCandidate.addExerciseSetDefinitionWithExecutionAmount(setTwo, 3)
        testCandidate.addExerciseSetDefinitionWithExecutionAmount(setThree, 3)
        testCandidate.addExerciseSetDefinitionWithExecutionAmount(setFour, 3)
        testCandidate.addExerciseSetDefinitionWithExecutionAmount(setFive, 3)

        val controlList = listOf(setOne, setTwo, setThree, setFour, setFive)
        val controlListExecutionAmount = listOf(1, 3, 3, 3, 3)

        val controlIterator = controlList.iterator()
        val controlIteratorExecutionAmount = controlListExecutionAmount.iterator()

        val setsIterator = testCandidate.definitionsIterator()

        while (setsIterator.hasNext() || controlIterator.hasNext() || controlIteratorExecutionAmount.hasNext()) {
            val nextActualSetDefinition = setsIterator.next()

            assertThat(nextActualSetDefinition.exerciseSetDefinition, `is`(equalTo(controlIterator.next())))
            assertThat(nextActualSetDefinition.executionAmount, `is`(equalTo(controlIteratorExecutionAmount.next())))
        }
    }
}