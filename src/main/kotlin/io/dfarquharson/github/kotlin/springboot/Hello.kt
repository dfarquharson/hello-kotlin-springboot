package io.dfarquharson.github.kotlin.springboot

class Calculator {

    fun add(a: Int, b: Int): Int {
        return a + b
    }

}

data class Person(val name: String, val age: Int)

fun hello(): String {
    return "hi"
}