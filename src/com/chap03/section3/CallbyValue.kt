package com.chap03.section3

fun main() {
    val result = CallbyValue(lambda())
    println(result)
}

fun CallbyValue(b:Boolean) : Boolean {
    println("CallbyValue Function")
    return b
}

val lambda: () -> Boolean = {
    println("lambda function")
    true
}
