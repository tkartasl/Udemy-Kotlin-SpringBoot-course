package com.kotlinplayground.classes

data class Employee(val id : Int,
    val name : String)

fun main() {
    val employee = Employee(23, "Aki Ahertaja")
    println("employee : $employee")

    val employee2 = Employee(23, "Aki Ahertaja")
    println("employee == employee2 : ${employee == employee2}")

    val employee3 = employee.copy(id = 20, name = "Mikko Mallikas")
    println(employee3)
}