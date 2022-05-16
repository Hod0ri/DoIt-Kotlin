package com.chap05.section02.init

class Bird (var name: String, var wing: Int, var beak: String, var color:String) {

    init {
        println("---------- 초기화 ----------")
        println("My Name is $name")
        this.sing(3)
        println("---------- 초기화 끝 ----------")
    }

    fun fly() = println("Fly wing : $wing")
    fun sing(vol : Int) = println("Sing vol : $vol")
}

fun main() {
    val coco = Bird("Bori", 2, "Long", "orange")

    coco.color = "Green"

    println("coco's Color : ${coco.color}")
    coco.fly()
    coco.sing(3)
}