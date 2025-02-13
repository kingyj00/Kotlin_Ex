package com.ll

fun main() {
    val name: String? = null // nullable 타입

    println(name?.length ?: "Name is null") // 안전한 호출 연산자와 엘비스 연산자 사용

}