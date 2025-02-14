package com.ll

class Person(val name: String, var age: Int, var weight: Double, var salary: Double) {
    fun increaseAge(years: Int) {
        age += years
    }

    fun increaseWeight(kg: Double) {
        weight += kg
    }

    fun increaseSalary(amount: Double) {
        salary += amount
    }

    fun getInfo() = "$name is $age years old, weighs $weight kg, and earns $$salary"
}

fun main() {
    val person = Person("Alice", 30, 55.0, 50000.0)

    val info = with(person) {
        increaseAge(5)
        increaseWeight(3.5)
        increaseSalary(10000.0)
        getInfo() // 마지막 실행된 값이 반환됨
    }

    println(info)
}