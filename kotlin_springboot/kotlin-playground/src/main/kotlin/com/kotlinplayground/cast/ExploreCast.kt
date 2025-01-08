package com.kotlinplayground.cast

import com.kotlinplayground.classes.Course

fun checkType(type: Any) {
    when(type) {
        is Course -> println(type)
        is String -> println(type.lowercase())
    }
}

fun castNumber(any: Any) {
    when(any) {
        any as Double -> println("value is Double")
    }
}
fun main() {
    val course = Course(1,
        "Reactive Programming in modern java using something",
        "Tomi")

    checkType(course)
    checkType("HELLO")

    castNumber(1.0)
    //castNumber(1)

    val number = 1
    val numberDouble = number.toDouble()
    castNumber(numberDouble)
}