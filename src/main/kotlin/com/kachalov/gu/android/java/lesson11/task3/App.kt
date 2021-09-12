package com.kachalov.gu.android.java.lesson11.task3

fun main() {
    val apples = Box<Apple>()
    val apples2 = Box<Apple>()
    val oranges = Box<Orange>()

    apples += Apple()
    apples += Apple()
    apples2 += Apple()
    oranges += Orange()
    oranges += Orange()

    println("apples weight: ${apples.weight}")
    println("apples2 weight: ${apples2.weight}")
    println("oranges weight: ${oranges.weight}")

    println("move apples to apples2")
    apples.moveTo(apples2)

    println("apples weight: ${apples.weight}")
    println("apples2 weight: ${apples2.weight}")

    println("oranges == apples: ${apples.compare(oranges)}")
    println("oranges == apples2: ${apples2.compare(oranges)}")
}