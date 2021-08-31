package com.example.kotlindasar

fun main() {
    hello("Mufti")
    hello("Mufti", "Ramdhani")
    hello("Dzaky")
    hello("Edi", "Sunardi")
}

fun hello(firstName: String, lastName: String? = null) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}
