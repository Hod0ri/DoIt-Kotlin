package com.chap03.section5

fun main() {
    shortFunc3(3) {
        println("First Call : $it")
        return
    }
}

inline fun shortFunc3(a:Int, out:(Int) -> Unit) {
    println("Before Calling Out()")
    out(a)
    println("After Calling Out()")
}