package com.ll

fun main() {
    try {
        val result = 10 / 0 // 0으로 나누는 예외 발생
        println("결과: $result")
    } catch (e: ArithmeticException) { // 예외 처리
        println("예외 발생: " + e.message)
    } finally {
        println("이 코드는 항상 실행됩니다.")
    }
}