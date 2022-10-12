package org.ethasia.workoutwizard.core.exercises.tests

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.assertThat
import org.junit.Test

import org.ethasia.workoutwizard.core.exercises.ExerciseBaseType
import org.ethasia.workoutwizard.core.exercises.ExerciseSetDefinition

class ExerciseSetDefinitionTest {

    @Test
    fun testBuilderSetsPropertiesCorrectly() {
        val product: ExerciseSetDefinition = ExerciseSetDefinition.Builder()
            .baseType(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)
            .name("Dumbbell Flies")
            .uniqueId("mbgjndfkfdkj")
            .build()

        assertThat(product.baseType, `is`(equalTo(ExerciseBaseType.WITH_REPETITIONS_AND_WEIGHTS)))
        assertThat(product.name, `is`(equalTo("Dumbbell Flies")))
        assertThat(product.uniqueId, `is`(equalTo("mbgjndfkfdkj")))
    }
}