package com.example.kotlindasar

fun main() {
    val result = "Muhammad Mufti" to "UP"
    println(result)
}

infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}