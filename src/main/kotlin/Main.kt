package com.ll

class Example {
    lateinit var value: String // 초기화 없이 선언 가능

    fun printValue() {
        println(value) // 초기화 전 접근하면 예외 발생
    }
}

fun main() {
    val example = Example()
    example.value = "Hello, Kotlin!" // 나중에 값 설정
    example.printValue()
}