package com.chap03.section3

fun main() {
    val out: () -> Unit = { println("Hello Kotlin!") }

    out()
    val new = out
    new()
}
