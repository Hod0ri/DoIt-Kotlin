package com.chap03.section5

fun main() {
    shortFunc4(3) {
        println("First Call : $it")

    }
}

inline fun shortFunc4(a:Int, crossinline out:(Int) -> Unit) {
    println("Before Calling Out()")
    nestedFunc {out(a)}
    println("After Calling Out()")
}

fun nestedFunc(body: () -> Unit) {
    body()
}