package org.ethasia.workoutwizard.core.exercises.tests

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.assertThat
import org.junit.Test
import java.util.*

import org.ethasia.workoutwizard.core.exercises.ExerciseBaseType
import org.ethasia.workoutwizard.core.exercises.ExerciseSetWithoutRepetitionsAndWeights

class ExerciseSetWithoutRepetitionsAndWeightsTest {

    @Test
    fun testBuilderSetsPropertiesCorrectly() {
        val product: ExerciseSetWithoutRepetitionsAndWeights = ExerciseSetWithoutRepetitionsAndWeights.Builder()
            .name("Rotisserie")
            .build()

        assertThat(product.name, `is`(equalTo("Rotisserie")))
    }

    @Test
    fun testExerciseSetHasCorrectBaseType() {
        val product: ExerciseSetWithoutRepetitionsAndWeights = ExerciseSetWithoutRepetitionsAndWeights.Builder()
            .name("Rotisserie")
            .build()

        assertThat(product.getBaseType(), `is`(equalTo(ExerciseBaseType.WITH_NOTHING)))
    }
}