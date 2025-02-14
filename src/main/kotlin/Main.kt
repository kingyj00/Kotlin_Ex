package com.ll

class Person(val name: String, val age: Int) {
    constructor(name: String) : this(name, 0) // 주 생성자 호출
}

fun main() {
    val person1 = Person("Alice", 25)
    val person2 = Person("Bob") // age는 기본값 0
}