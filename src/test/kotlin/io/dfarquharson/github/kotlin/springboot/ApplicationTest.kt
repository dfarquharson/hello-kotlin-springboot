package io.dfarquharson.github.kotlin.springboot

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GreetingControllerTest {

    private val greetingController = GreetingController()

    @Test
    fun defaultName() {
        assertThat(greetingController.greeting("bob"))
            .isEqualTo(Greeting(1L, "Hello, bob"))
    }

}