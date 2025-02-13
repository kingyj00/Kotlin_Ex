package com.ll

fun String.greet(): String {
    return "Hello, $this!"
}

fun main() {
    println("Alice".greet()) // 확장 함수 사용
}