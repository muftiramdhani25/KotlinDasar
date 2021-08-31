package com.example.kotlindasar

fun main() {
    var array = arrayOf("Muhammad", "Mufti", "Ramdhani", "Edi", "Dzaky", "Duls")

    var total = 0
    for (name in array) {
        println(name)
        total++
    }
    println("Total perulangan = $total")

    val ukuranArray = array.size - 1
    for (i in 0..ukuranArray) {
        println("Index $i = ${array.get(i)}")
    }
}