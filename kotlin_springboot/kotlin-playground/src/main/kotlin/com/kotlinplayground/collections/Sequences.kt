package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

fun exploreFilterUsingSequence(
    courseList: MutableList<Course>,
    predicate: (Course)->Boolean
) {
    courseList
        .asSequence()
        .filter { predicate.invoke(it) }
        .forEach { println("dev courses: ${it.name}") }

    val range = 1 .. 1000000000

    range
        //.asSequence()
        .map { it.toDouble() }
        .take(40)
        .forEach { println("value is $it") }
}

fun main() {
    val namesListUsingSequence = listOf("alex", "ben", "chloe")
        .asSequence()
        .filter{ it.length >= 4 }
        .map { it.uppercase() }
        .toList()

    println("namesListUsingSequence: $namesListUsingSequence")

    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }

    exploreFilterUsingSequence(courseList(), devPredicate)
}