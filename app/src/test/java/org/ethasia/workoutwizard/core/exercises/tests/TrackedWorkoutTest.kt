package org.ethasia.workoutwizard.core.exercises.tests

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.assertThat
import org.junit.Test
import java.util.*

import org.ethasia.workoutwizard.core.exercises.ExerciseSet
import org.ethasia.workoutwizard.core.exercises.ExerciseSetWithRepetitionsAndWeights
import org.ethasia.workoutwizard.core.exercises.TrackedWorkout

class TrackedWorkoutTest {

    @Test
    fun testBuilder_setProperties_propertiesAreInProduct() {
        val testExerciseSet: ExerciseSet = ExerciseSetWithRepetitionsAndWeights.Builder()
            .weight(30.0f)
            .repetitionCount(8)
            .build()

        val testExerciseSetTwo: ExerciseSet = ExerciseSetWithRepetitionsAndWeights.Builder()
            .weight(30.0f)
            .repetitionCount(8)
            .build()

        val product: TrackedWorkout = TrackedWorkout.Builder()
            .name("Bench Press")
            .addExerciseSet(testExerciseSet)
            .addExerciseSet(testExerciseSetTwo)
            .build()

        assertThat(product.name, `is`(equalTo("Bench Press")))
        assertThat(product.sets, hasItems(testExerciseSet, testExerciseSetTwo))
    }
}