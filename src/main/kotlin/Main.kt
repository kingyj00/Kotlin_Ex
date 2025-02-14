package com.ll

fun main() {
    val name: String? = null

    name?.let {
        println("Length: ${it.length}")
    }
}