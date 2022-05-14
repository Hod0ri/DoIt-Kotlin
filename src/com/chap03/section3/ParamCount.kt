package com.chap03.section3

fun main() {
    noParam({ "Hello Kotlin "})
    noParam { "Hello Kotlin" }

}

fun noParam(out: () -> String) = println(out())