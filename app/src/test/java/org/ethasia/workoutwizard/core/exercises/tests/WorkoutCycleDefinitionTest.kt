package org.ethasia.workoutwizard.core.exercises.tests

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.assertThat
import org.junit.Test

import org.ethasia.workoutwizard.core.exercises.ExerciseBaseType
import org.ethasia.workoutwizard.core.exercises.ExerciseSetDefinition
import org.ethasia.workoutwizard.core.exercises.WorkoutCycleDefinition

class WorkoutCycleDefinitionTest {

    @Test
    fun testIteratorReturnsPreviouslyAddedExerciseSets() {
        val testCandidate = WorkoutCycleDefinition("Push Workout")

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

        testCandidate.addExerciseSetDefinition(setOne)
        testCandidate.addExerciseSetDefinition(setTwo)
        testCandidate.addExerciseSetDefinition(setThree)
        testCandidate.addExerciseSetDefinition(setFour)
        testCandidate.addExerciseSetDefinition(setFive)

        val controlList = listOf(setOne, setTwo, setThree, setFour, setFive)
        val controlIterator = controlList.iterator()

        val setsIterator = testCandidate.definitionsIterator()

        while (setsIterator.hasNext() || controlIterator.hasNext()) {
            assertThat(setsIterator.next(), `is`(equalTo(controlIterator.next())))
        }
    }
}