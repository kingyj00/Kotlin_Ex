package com.ll

data class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Alice", 30)
    println(person) // 자동 생성된 toString() 사용
}