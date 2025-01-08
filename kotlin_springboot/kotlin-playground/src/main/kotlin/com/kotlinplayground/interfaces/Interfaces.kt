package com.kotlinplayground.interfaces

import com.kotlinplayground.classes.Course

interface CourseRepository {
    val isCoursePersisted : Boolean
    fun getById(id: Int) : Course

    fun save(course: Course) : Int {
        println("course : $course")
        return course.id
    }
}

interface Repository {
    fun getAll() : Any
}

class SqlCourseRepository : CourseRepository, Repository {
    override var isCoursePersisted: Boolean = false
    override fun getById(id: Int): Course {
        return Course(id,
            "Reactive Programming in modern java using something",
            "Tomi")
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return super.save(course)
    }

    override fun getAll() : Any {
        return 1
    }
}

class NoSqlCourseRepository : CourseRepository {
    override var isCoursePersisted: Boolean = false
    override fun getById(id: Int): Course {
        return Course(id,
            "Reactive Programming in modern java using something",
            "Tomi")
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        println("course in NoSqlCourseRepository : $course")
        return course.id
    }
}

interface A {
    fun doSomething() {
        println("do something in A")
    }
}

interface B {
    fun doSomething() {
        println("do something in B")
    }
}

class AB : A, B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("do something in AB")
    }
}

fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println(course)
    sqlCourseRepository.save(course)

    println("Course persisted value is ${sqlCourseRepository.isCoursePersisted}")
    val nosqlCourseRepository = NoSqlCourseRepository()
    val course1 = sqlCourseRepository.getById(1)
    println(course1)
    val courseId = nosqlCourseRepository.save(course1)
    println("course id is ${courseId}")

    val ab = AB()
    ab.doSomething()
}