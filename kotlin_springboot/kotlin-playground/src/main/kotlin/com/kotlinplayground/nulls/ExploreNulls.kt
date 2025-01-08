package com.kotlinplayground.nulls

data class Movie(
    val id : Int?,
    val name : String
)

fun printName(name : String) {
    println("Name is $name")
}

fun printName1(name : String?) {
    println("Name is $name")
}

fun main() {
    var nameNullable : String? = null

    //printName(nameNullable!!)
    nameNullable?.run {
        printName(this) }
    println("value is: ${nameNullable?.length}")
    nameNullable = "Tomi"
    printName1(nameNullable)
//    val length = nameNullable?.length?.toLong() ?: 0 // Elvis operator

    val length = nameNullable.length.toLong() ?: 0
    println("length is: $length")

//    if (nameNullable != null) {
//    println("value is: ${nameNullable.length}")
//    }

    nameNullable = "Tomi"
    println("Name is $nameNullable")

    var name : String = "Tomi"

    val movie = Movie(null, "Avengers")
    val savedMovie = saveMovie(movie)
    println(savedMovie.id!!) // non null assertion
    println("Saved movie is ${savedMovie}")
}

fun saveMovie(movie: Movie): Movie {
    //return movie.copy(id = 1)
    return movie
}