package com.kotlinplayground.classes

class Person(val name : String = "",
             val age : Int = 0) {
    var email : String = ""
    var nameLength: Int = 0
    init {
        println("Init block")
        nameLength = name.length
    }
    constructor(_email: String,
        _name: String = "",
        _age: Int = 0) : this(_name, _age) {
        email = _email
    }

    fun action() {
        println("Person walks")
    }
}

fun main() {
//    val person = Person("Tomi", 38)
//    person.action()
//    println("name : ${person.name} and age : ${person.age}")
//
//    val person1 = Person()
//    println("name : ${person1.name} and age : ${person1.age}")
    val person2 = Person(_email = "abc@gmail.com", "Tomi", 38)
    println("name : ${person2.name} and age : ${person2.age} + " +
            "and email : ${person2.email} and the name length is ${person2.nameLength}")
}