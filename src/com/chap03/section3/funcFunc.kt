package com.chap03.section3

fun main() {
    print("funcFunc : ${funcFunc()}")
}

fun sumFunc(a:Int, b:Int) = a+b

fun funcFunc(): Int {
    return sumFunc(2, 2)
}
