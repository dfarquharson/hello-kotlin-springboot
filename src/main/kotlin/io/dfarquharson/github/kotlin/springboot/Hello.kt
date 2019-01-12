package io.dfarquharson.github.kotlin.springboot

// good old-fashioned class too
class Calculator {

    fun add(a: Int, b: Int = num): Int {
        return a + b
    }

    // you can toss static stuff into companion objects
    companion object Calculator {
        const val num = 1
    }
}

// simple immutable "POJO" via data class
data class Person(val name: String, val age: Int)

// simple top-level function
fun hello(): String {
    return "hi"
}