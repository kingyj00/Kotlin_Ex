package com.ll

object Singleton {
    fun showMessage() {
        println("Hello from Singleton!")
    }
}

fun main() {
    Singleton.showMessage() // 인스턴스 생성 없이 바로 사용 가능
}
