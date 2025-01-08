package com.kotlinplayground.classes

open class User(val name : String) {
    open var isLoggedIn : Boolean = false
   open fun login() {
        println("inside user login")
    }
    private fun secret() {
        println("inside secret fun")
    }

    protected open fun logout() {
        println("inside logout fun")
    }
}

class Student(name : String) : User(name) {
    override var isLoggedIn: Boolean = false

    companion object {
        const val noOfEnrolledCourses = 10
        fun country() = "USA"
    }

    override fun login() {
        println("inside student login")
        super.login()
        super.logout()
    }

  override fun logout() {
      println("inside student logout")
   }
}

class Instructor(name : String) : User(name) {}

fun main() {
    val student = Student("Alex")
    println("name is ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("Logged in value is ${student.isLoggedIn}")

    println(Student.country())

    println("noOfEnrolledCourses is ${Student.noOfEnrolledCourses}")

    val instructor = Instructor("John")
    println("name is ${instructor.name}")
    instructor.login()

    val user = User("Tom")

}