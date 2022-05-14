package com.chap03.section3

/**
 * 일급 객체 (First Class Citizen)
 * 1. 일급 객체는 함수의 인자로 전달할 수 있다.
 * 2. 일급 객체는 함수의 반환값에 사용할 수 있다.
 * 3. 일급 객체는 변수에 담을 수 있다.
 *
 * 고차 함수 (High-Order Function)
 * 다른 함수의 인자를 사용하거나, 함수를 결과값으로 반환하는 함수
 */

fun main() {
    val res1 = sum(3, 2)
    val res2 = mul(sum(3, 3), 3)

    println("res1 : ${res1}, res2 : ${res2}")
}

fun sum(a:Int, b:Int) = a+b
fun mul(a:Int, b:Int) = a*b
