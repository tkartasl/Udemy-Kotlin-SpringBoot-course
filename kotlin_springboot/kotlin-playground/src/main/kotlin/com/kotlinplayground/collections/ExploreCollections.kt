package com.kotlinplayground.collections

fun main() {
    val names = listOf("Alex", "Ben", "Chloe")
    println("names: $names")

    val namesMutableList = mutableListOf("Alex", "Ben", "Chloe")
    println("namesMutableList: $namesMutableList")
    namesMutableList.add("Adam")
    println("namesMutableList after: $namesMutableList")

    val set = setOf("Alex", "Ben", "Chloe")
    println("set: $set")

    val mutableSet = mutableSetOf("Alex", "Ben", "Chloe")
    println("mutableSet: $mutableSet")
    mutableSet.add("Adam")
    println("mutableSet after: $mutableSet")

    val nameAgeMap = mapOf("Tomi" to 38, "Alex" to 27)
    println("nameAgeMap: $nameAgeMap")

    val mutableNameAgeMap = mutableMapOf("Tomi" to 38, "Alex" to 27)
    mutableNameAgeMap["Adam"] = 20
    println("mutableNameAgeMap after: $mutableNameAgeMap")

}