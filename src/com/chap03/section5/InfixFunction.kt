package com.chap03.section5

fun main() {
    val multi = 3 multiply 10
    print("multi : ${multi}")
}

infix fun Int.multiply(x:Int): Int {
    return this * x
}