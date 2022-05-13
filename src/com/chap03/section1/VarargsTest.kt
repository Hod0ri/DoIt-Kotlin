package com.chap03.section1

fun main() {
    normalVaragrs(1, 2, 3, 4)
    normalVaragrs(4, 5, 6)
}

fun normalVaragrs(vararg counts:Int) {
    for (num in counts) {
        print("$num")
    }
    print("\n")
}