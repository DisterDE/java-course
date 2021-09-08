package com.kachalov.gu.android.java.lesson7

class Plate(private var food: Int) {

    fun decreaseFood(amount: Int): Boolean {
        if (amount <= food) {
            food -= amount
            return true
        }
        return false
    }

    fun info() {
        println("plate: $food")
    }

    fun increaseFood(amount: Int) {
        food += amount
    }
}