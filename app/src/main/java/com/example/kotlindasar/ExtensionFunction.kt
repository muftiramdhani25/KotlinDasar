package com.example.kotlindasar

fun main() {
    val name = "Mufti"

    println(name.hello())

    name.printHello()

    "Ramdhani".printHello()
}

fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")