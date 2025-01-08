package com.kotlinplayground.basics

fun main() {
    val name = "Alex"

    val result = if(name.length == 4) {
        println("Name is 4 characters long")
        name.length
    } else {
        println("Name is not 4 characters long")
        name.length
    }

    println("result : $result")
    var position = 1
    position = 2
    val medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }
    println(medal)
}