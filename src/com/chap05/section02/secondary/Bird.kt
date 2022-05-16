package com.chap05.section02.secondary

class Bird {
    var name : String
    var wing : Int
    var beak : String
    var color : String

    constructor(name:String, wing:Int, beak:String, color:String) {
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }

    fun fly() = println("Fly wing : $wing")
    fun sing(vol : Int) = println("Sing vol : $vol")
}

fun main() {
    val coco = Bird("Bori", 2, "Long", "orange")

    coco.color = "Hot Pink"

    println("coco's Color : ${coco.color}")
    coco.fly()
    coco.sing(3)
}