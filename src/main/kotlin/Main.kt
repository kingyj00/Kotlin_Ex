package com.ll

class Person(val name: String, val age: Int, val country: String) {
    constructor(name: String, age: Int) : this(name, age, "Unknown")
    constructor(name: String) : this(name, 0)
}

fun main() {
    val p1 = Person("Alice", 25, "USA")
    val p2 = Person("Bob", 30) // country는 "Unknown"
    val p3 = Person("Charlie") // age와 country 기본값 사용
}