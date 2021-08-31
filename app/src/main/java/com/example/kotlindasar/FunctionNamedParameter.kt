package com.example.kotlindasar

fun main() {
    fullName("Muhammad", "Mufti", "Ramdhani")
    fullName(
        lastName = "Ramdhani",
        firstName = "Muhammad",
        middleName = "Mufti"
    )
}

fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
) {
    println("Hello $firstName $middleName $lastName")
}
