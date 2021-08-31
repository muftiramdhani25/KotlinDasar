package com.example.kotlindasar

fun main() {
    sayHello("Mufti", "Ramdhani")
    sayHello("Dzaky", null)
    sayHello("Edi", "Sunardi")
}

fun sayHello(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}