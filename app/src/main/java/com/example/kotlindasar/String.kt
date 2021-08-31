package com.example.kotlindasar

fun main() {
    var firstName: String = "Mufti"
    var lastName: String = "Ramdhani"

    var address: String = """
        >Jalan belum jadi, RT 01 RW 01,
        >Kabupaten Bogor,
        >Jawa barat,
        >Indonesia
        """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(address)

    var fullName: String = "$firstName $lastName"
    println(fullName)

    var desc: String = "$fullName length = ${fullName.length}"
    println(desc)
}