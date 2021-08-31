package com.example.kotlindasar

fun main() {
    val names: Array<String> = arrayOf("Mufti", "Dhani", "Muhammad")
    // names.set(0, "Rudi")
    names[0] = "Budi"
    println(names[0])

    val nilai: Array<Int> = arrayOf(10,9,8)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    val members: Array<String?> = arrayOfNulls(5)
    members[0] = "Mufti"
    members[1] = "Mufti"
    members[2] = "Mufti"
    members[3] = null
    members[4] = "Mufti"
    println(members.size)
}