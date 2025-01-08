@file:JvmName("CourseUtils")

package com.kotlinplayground.classes

import com.kotlinplayground.CourseJava

data class Course(
    val id: Int,
    val name: String,
    val author: String,
    var courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
) {
    @JvmField
    var noOfCourses = 10

    companion object {
        @JvmStatic
        fun printName2(name : String = "default") {
            println("name: $name")
        }
    }
}

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

@JvmName("printName1")
@JvmOverloads
fun printName(name : String = "default") {
    println("name: $name")
}

fun main() {
    val course = Course(1,
        "Reactive Programming in modern java using something",
        "Tomi")
    //println(course)
    val course1 = Course(1,
        "Reactive Programming in modern java using something",
        "Tomi")
    println("Checking Object equality : ${course == course1}")

    val course3 = course1.copy(
        id=2, author="Tomi2"
    )
    println(course3)

    val marketingCourse = Course(2,
        "Facebook marketing",
        "Jeppe",
        CourseCategory.MARKETING)

    println(marketingCourse)

   val courseJava =  CourseJava(2,
        "Facebook marketing",
        "Jeppe")
    println("courseJava: $courseJava")
    courseJava.id = 3
    courseJava.name = "abc"
    println("courseJava: $courseJava")
}