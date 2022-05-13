package com.chap03.section1

// 덧셈 함수 정의 하기
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 덧셈 함수 간략하게 표현하기
fun sum2(a:Int, b:Int) = a+b

fun main() {
    val result1 = sum(3,2)
    val result2 = sum2(6, 7)

    println(result1)
    println(result2)
}