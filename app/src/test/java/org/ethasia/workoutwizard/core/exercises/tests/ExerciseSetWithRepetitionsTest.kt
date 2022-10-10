package org.ethasia.workoutwizard.core.exercises.tests

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.assertThat
import org.junit.Test

import org.ethasia.workoutwizard.core.exercises.ExerciseBaseType
import org.ethasia.workoutwizard.core.exercises.ExerciseSetWithRepetitions

class ExerciseSetWithRepetitionsTest {

    @Test
    fun testBuilderSetsPropertiesCorrectly() {
        val product: ExerciseSetWithRepetitions = ExerciseSetWithRepetitions.Builder()
            .repetitionCount(20)
            .name("Pushups")
            .uniqueId("zuijhgbf")
            .build()

        assertThat(product.repetitionCount, `is`(equalTo(20)))
        assertThat(product.name, `is`(equalTo("Pushups")))
        assertThat(product.uniqueId, `is`(equalTo("zuijhgbf")))
    }

    @Test
    fun testExerciseSetHasCorrectBaseType() {
        val product: ExerciseSetWithRepetitions = ExerciseSetWithRepetitions.Builder()
            .repetitionCount(20)
            .name("Pushups")
            .build()

        assertThat(product.getBaseType(), `is`(equalTo(ExerciseBaseType.WITH_REPETITIONS))
        )
    }
}