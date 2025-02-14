package com.ll

import java.util.function.Consumer
import java.util.stream.Collectors

fun main() {
    val names: List<String> = mutableListOf("Alice", "Bob", "Charlie")

    val greetings = names.stream()
        .map { name: String -> "Hello, $name" }
        .collect(Collectors.toList())

    greetings.forEach(Consumer { x: String? -> println(x) })
}