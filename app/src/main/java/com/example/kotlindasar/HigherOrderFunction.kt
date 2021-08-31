package com.example.kotlindasar

fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper = { value: String -> value.toUpperCase() }
    println(hello("Mufti", lambdaUpper))

    println(hello("Mufti", { value: String -> value.toLowerCase() }))

    // trailing lambda
    val result1 = hello("Mufti", { value: String -> value.toLowerCase() })
    val result2 = hello("Mufti") { value: String ->
        value.toLowerCase()
    }
}