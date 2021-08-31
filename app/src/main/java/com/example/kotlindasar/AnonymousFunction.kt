package com.example.kotlindasar

fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    // ini anonymous function
    // gak bisa pake lambda karena kita butuh dua return
    val upper = fun(value: String): String {
        if (value == "") {
            return "UPS"
        } else {
            return value.toUpperCase()
        }
    }

    println(hello("Mufti", upper))
    println(hello("", upper))

    // anonymous function as parameter
    println(hello("Ramdhani", fun(value: String): String {
        return value.toLowerCase()
    }))

}