package com.kotlinplayground.functions

import java.time.LocalDate

fun printName(name: String) {
    println("My name is $name")
}

fun addition(x: Int, y: Int) : Int {
    return x + y
}

fun additionApproach1(x: Int, y: Int) = x + y

fun printPersonDetails(name : String,
                       email : String = "",
                       dob : LocalDate = LocalDate.now()
) {
    println("Name is $name and email is $email and dob is $dob")
}

fun main() {
    printName("Tomi")
    val result = addition(1, 2)
    val result1 = additionApproach1(1, 2)
    println("result is $result\nresult1 is $result1")
    printPersonDetails("Tomi", "abc@gmail.com", LocalDate.parse("2000-01-01"))

    printPersonDetails("Tomi")
    printPersonDetails(name = "Tomi", dob = LocalDate.parse("2000-01-01"))
}
