package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.KAFKA
import com.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()

    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }
    val desPredicate = { c: Course -> c.category == CourseCategory.DESIGN }

    val list = listOf(listOf(1,2,3), listOf(4,5,6))

    val flatMap = list.flatMap { outerList ->
        outerList.map {
            it.toDouble()
        }
    }
//    println("map: $flatMap")

//    exploreFilter(courseList, desPredicate)
//
//    exploreMap(courseList, desPredicate)
    val res = exploreFlatMap(courseList, KAFKA)
//    println("res: $res")

    //exploreHashMap()
    collections_nullability()
}

fun collections_nullability() {
    var list : MutableList<String>? = null

    list = mutableListOf()
    list.add("Tomi")
    list.forEach {
        println("Value is $it")
    }
    val list1 : List<String?> = listOf("Adam", null, "Alex")
    list1.forEach {
        println("Length is ${it?.length}")
    }
}

fun exploreHashMap() {
    val nameAgeMutableMap = mutableMapOf("Tomi" to 38, "Aleksi" to 27)
    nameAgeMutableMap
        .forEach { (k, v) ->
            println("key: $k, value: $v")
        }
    val value = nameAgeMutableMap.getOrElse("Tomi1") {"abc"}
    println("value: $value")

    val result = nameAgeMutableMap.containsKey("Tomi")
    println("result: $result")

    val filteredMap = nameAgeMutableMap.filterKeys { it.length > 5 }
        .map { it.key.uppercase() }
    println("filteredMap: $filteredMap")

    val maxAge = nameAgeMutableMap
        .maxByOrNull { it.value }
    println("maxAge: $maxAge")
}

fun exploreFlatMap(courseList: MutableList<Course>, kafka: String): List<String> {
   val kafkaCourses = courseList.flatMap { course ->
        val courseName = course.name
        course.topicsCovered.filter {
            it == kafka
        }.map {
            courseName
        }
    }
    return kafkaCourses
}

fun exploreMap(courseList: MutableList<Course>, predicate: (Course)->Boolean) {

   val courses = courseList
       .filter(predicate)
       .map { "${it.name} - ${it.category}" }
       .forEach{ println(it) }

//println("Courses: $courses")
}

fun exploreFilter(
    courseList: MutableList<Course>,
    predicate: (Course)->Boolean
) {
    val developmentCourses = courseList
        .filter { predicate.invoke(it) }
        .forEach { println("dev courses: ${it.name}") }
    println("Development courses: $developmentCourses")
}