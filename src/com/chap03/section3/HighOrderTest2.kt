package com.chap03.section3

fun main() {
    var result: Int
    result = highorder({x, y -> x+y}, 10, 20)

    println(result)
}

fun highorder(sum: (Int, Int) -> Int, a:Int, b:Int): Int {
    return sum(a,b)
}