package org.ethasia.workoutwizard.core.exercises.tests

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.assertThat
import org.junit.Test
import java.util.*

import org.ethasia.workoutwizard.core.exercises.ExerciseBaseType
import org.ethasia.workoutwizard.core.exercises.ExerciseSetWithRepetitionsAndWeights

class ExerciseSetWithRepetitionsAndWeightsTest {

    @Test
    fun testBuilder_setExerciseSetProperties_propertiesAreInProduct() {
        val product: ExerciseSetWithRepetitionsAndWeights = ExerciseSetWithRepetitionsAndWeights.Builder()
            .weight(12.5f)
            .repetitionCount(8)
            .name("Dumbbell curls")
            .uniqueId("ddfsdd")
            .build()

        assertThat(product.weight, `is`(equalTo(12.5f)))
        assertThat(product.repetitionCount, `is`(equalTo(8)))
        assertThat(product.name, `is`(equalTo("Dumbbell curls")))
        assertThat(product.uniqueId, `is`(equalTo("ddfsdd")))
    }

    @Test
    fun testExerciseSetHasCorrectBaseType() {
        val product: ExerciseSetWithRepetitionsAndWeights = ExerciseSetWithRepetitionsAndWeights.Builder()
            .weight(20.0f)
            .repetitionCount(8)
            .name("Barbell press")
            .build()

        assertThat(product.getBaseType(), `is`(equalTo(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)))
    }
}