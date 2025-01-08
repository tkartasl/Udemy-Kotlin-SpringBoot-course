package com.kotlinplayground.collections


fun calculate(x: Int, y: Int, op: (x: Int, y: Int)->Int ) : Int {
    return op(x, y)
}

fun main() {
    val addLambda = { x: Int -> x + x }

    val result = addLambda(3)
    println("addResult: $result")

    val multiplyLamdba = { x: Int, y: Int ->
        println("x is $x , y is $y")
        x * y
    }

    val multiplyResult = multiplyLamdba(2, 3)
    println("multiplyResult: $multiplyResult")

    val calculateResult = calculate(2, 3) { a, b -> a * b }
    println("calculateResult: $calculateResult")

    val add = calculate(2, 3, { a, b -> a + b })
    println("add Result: $add")
}