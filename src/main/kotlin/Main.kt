package com.ll

fun main() {
    val name: String? = null
    val displayName = name ?: "Guest" // 엘비스 연산자로 기본값 제공

    println("Hello, $displayName")
}

