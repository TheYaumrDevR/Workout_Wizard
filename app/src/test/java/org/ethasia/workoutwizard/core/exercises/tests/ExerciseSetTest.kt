package org.ethasia.workoutwizard.core.exercises.tests

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.assertThat
import org.junit.Test
import java.util.*

import org.ethasia.workoutwizard.core.exercises.ExerciseSet

class ExerciseSetTest {

    @Test
    fun testBuilder_setExerciseSetProperties_propertiesAreInProducct() {
        val testDate = Date()

        val product: ExerciseSet = ExerciseSet.Builder()
            .weight(12.5f)
            .repetitionCount(8)
            .performDate(testDate)
            .build()

        assertThat(product.weight, `is`(equalTo(12.5f)))
        assertThat(product.repetitionCount, `is`(equalTo(8)))
        assertThat(product.performDate, `is`(equalTo(testDate)))
    }
}