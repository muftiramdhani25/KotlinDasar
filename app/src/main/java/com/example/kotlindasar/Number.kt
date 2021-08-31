package com.example.kotlindasar

fun main() {
    var age: Int = 200
    var height: Byte = 30
    var distance: Short = 2000
    var sample: Float = 10.11F

    println(age)
    println(height)
    println(distance)
    println(sample)

    var binary: Int = 0b010101010
    println(binary)

    var price: Long = 9_000_000_000L;
    println(price)

    var priceInt: Int = price.toInt()
    println(priceInt)

    var doubleBinary: Double = binary.toDouble()
    println(doubleBinary)
}