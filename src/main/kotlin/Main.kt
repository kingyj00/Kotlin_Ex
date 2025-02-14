package com.ll

fun main() {
    val obj: Any = "Hello"

    if (obj is String) { // 스마트 캐스트 적용
        println(obj.length) // 자동으로 String으로 캐스팅됨
    }
}