package com.kotlinplayground.classes

class Item() {
    var name : String = ""
    var price : Double = 0.0
        get() {
            println("inside getter")
            return field
        }
        set(value) {
            if (value >= 0.0) {
                println("inside setter")
                field = value
            } else {
                throw IllegalArgumentException("Price cannot be less than zero")
            }
        }

    constructor(_name: String) : this() {
        name = _name
    }
}

fun main() {
    val item = Item("Iphone")
    println("name : ${item.name}")
    item.name = "Iphone 13"
    println("name : ${item.name}")
    item.price = -10.0
    println("price is ${item.price}")
}