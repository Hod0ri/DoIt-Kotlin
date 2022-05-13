package com.chap03.section1

// 매개 변수의 기본 값 지정
fun main() {
    val name = "George"
    val email = "george@gmail.com"

    add(name)
    add(name, email)
    add("Mike", "mike@naver.com")

    defaultArgs()
    defaultArgs(200)
}

fun add(name:String, email:String = "default") {
    val output = "${name}'s email : ${email}"
    println(output)
}

fun defaultArgs(x:Int=100, y:Int=200) {
    println(x + y)
}