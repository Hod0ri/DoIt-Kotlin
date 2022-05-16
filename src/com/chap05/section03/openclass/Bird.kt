package com.chap05.section03.openclass

open class Bird(var name: String, var wing: Int, var beak: String, var color:String) {
    fun fly() = println("Fly wing : $wing")
    fun sing(vol : Int) = println("Sing vol : $vol")
}

class Lark(name: String, wing: Int, beak: String, color:String): Bird(name, wing, beak, color) {
    fun singHitOne() = println("Happy Song!")
}

class Parrot:Bird {
    val language: String

    constructor(name:String,
                wing: Int,
                beak: String,
                color: String,
                language: String) : super(name, wing, beak, color) {
                    this.language = language
                }
    fun speak() = println("Speak! $language")
}

fun main() {
    val coco = Bird("Bori", 2, "short", "blue")
    val lark = Lark("Garu", 2, "long", "brown")
    val parrot = Parrot("Susu", 2, "short", "multiple", "korean")

    println("Coco : ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("Lark : ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    println("Coco : ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}")

    lark.singHitOne()
    parrot.speak()
    lark.fly()
}