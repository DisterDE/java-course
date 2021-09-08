package com.kachalov.gu.android.java.lesson7

import kotlin.random.Random.Default.nextInt

class Cat(
    val name: String,
    private val appetite: Int = nextInt(5, 20)
) {
    private var hungry = true

    fun eat(plate: Plate) {
        val success = plate.decreaseFood(appetite)
        if (success) {
            hungry = false
        } else {
            throw RuntimeException("Not enough food! I am hungry! I'm gonna kill ya, pathetic human!")
        }
    }

    fun info() {
        println("$name is hungry: $hungry")
    }
}