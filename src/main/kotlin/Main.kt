package com.ll

fun main() {
    val ages = mapOf("Alice" to 25, "Bob" to 30, "Charlie" to 35) // 불변 맵

    for ((name, age) in ages) {
        println("$name is $age years old.")
    }
}