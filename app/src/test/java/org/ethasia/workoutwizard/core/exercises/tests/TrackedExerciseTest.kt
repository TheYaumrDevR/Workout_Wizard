package org.ethasia.workoutwizard.core.exercises.tests

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.assertThat
import org.junit.Test
import java.util.*

import org.ethasia.workoutwizard.core.exercises.ExerciseSet
import org.ethasia.workoutwizard.core.exercises.TrackedExercise

class TrackedExerciseTest {

    @Test
    fun testBuilder_setProperties_propertiesAreInProduct() {
        val testExerciseSet = ExerciseSet.Builder()
            .weight(30.0f)
            .repetitionCount(8)
            .performDate(Date())
            .build()

        val testExerciseSetTwo = ExerciseSet.Builder()
            .weight(30.0f)
            .repetitionCount(8)
            .performDate(Date())
            .build()

        val product: TrackedExercise = TrackedExercise.Builder()
            .name("Bench Press")
            .addExerciseSet(testExerciseSet)
            .addExerciseSet(testExerciseSetTwo)
            .build()

        assertThat(product.name, `is`(equalTo("Bench Press")))
        assertThat(product.sets, hasItems(testExerciseSet, testExerciseSetTwo))
    }
}