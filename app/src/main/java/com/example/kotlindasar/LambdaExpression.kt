package com.example.kotlindasar

fun main() {
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = contohLambda("Mufti", "Ramdhani")
    println(result)

    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Mufti"))

    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase("Mufti Ramdhani"))
}

fun toUpper(value: String): String = value.toUpperCase()