package com.kotlinplayground.classes

object Authenticate {
    fun authenticate(userName: String, password: String) {
        println("User authenticated for userName: $userName")
    }
}

fun main() {
    Authenticate.authenticate("Aki", "123")
}