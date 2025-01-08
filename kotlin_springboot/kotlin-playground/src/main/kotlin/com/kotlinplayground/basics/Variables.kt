package com.kotlinplayground.basics

import com.kotlinplayground.functions.topLevelFunction
import com.kotlinplayground.functions.courseName

fun main() {
    val name = "Tomi"
    println(name)

    var age = 38
    println(age)

    age = 39
    println(age)

    val salary = 30000L
    println(salary)

    val course = "Kotlin Spring"
    println("course: $course and the course length is ${course.length}")

    val multiline = "ABC \n DEF"
    println(multiline)

    val multiline1 ="""
        ABC
        DEF
    """.trimIndent()
    println(multiline1)
    val result = topLevelFunction()
    println("result is $result")
    println("courseName: $courseName")
}