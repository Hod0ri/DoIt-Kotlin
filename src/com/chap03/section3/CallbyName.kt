package com.chap03.section3

fun main() {
    val result = CallbyName(otherlambda)
    println(result)
}

fun CallbyName(b: () -> Boolean): Boolean {
    println("CallbyName Function")
    return b()
}

val otherlambda: () -> Boolean = {
    println("otherlambda Function")
    true
}


