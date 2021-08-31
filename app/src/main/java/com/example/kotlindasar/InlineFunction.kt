package com.example.kotlindasar

fun main() {
    for (i in 0..10) {
        println(hello({ "Mufti" }, { "Ramdhani" }))
    }
}

inline fun hello(
    firstName: () -> String,
    noinline lastName: () -> String
): String {
    return "Hello ${firstName()} ${lastName()}"
}