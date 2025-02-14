package com.ll

class MathUtils {
    companion object {
        const val PI = 3.14159

        fun square(x: Int) = x * x
    }
}

fun main() {
    println("PI: ${MathUtils.PI}")
    println("Square of 4: ${MathUtils.square(4)}")
}