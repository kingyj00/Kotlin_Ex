package com.ll

val lazyValue: String by lazy {
    println("Initializing...") // 최초 접근 시 실행
    "Hello, Lazy!"
}

fun main() {
    println("Before accessing lazyValue")
    println(lazyValue) // 첫 호출 시 초기화됨
    println(lazyValue) // 이후에는 캐싱된 값 사용
}