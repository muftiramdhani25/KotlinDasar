package com.example.kotlindasar

fun main() {
    println(kaliDua(10))
    sapa("Mufti")
}

fun kaliDua(a: Int): Int = a * 2

fun sapa(name: String): Unit = println("Hello $name")