package io.dfarquharson.github.kotlin.springboot

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CalculatorTest {

    @Test
    fun `1 + 1 = 2`() {
        val calculator = Calculator()
        assertThat(calculator.add(1, 1)).isEqualTo(2)
    }

}

class PersonTest {

    @Test
    fun testEquality() {
        assertThat(Person("a", 1)).isEqualTo(Person("a", 1))
        assertThat(Person("a", 1).name).isEqualTo("a")
        assertThat(Person("a", 1).age).isEqualTo(1)
    }

}

class GeneralTest {

    @Test
    fun testHello() {
        assertThat(hello()).isEqualTo("hi")
    }

}