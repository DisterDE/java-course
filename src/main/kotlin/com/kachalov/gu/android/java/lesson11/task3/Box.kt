package com.kachalov.gu.android.java.lesson11.task3

import kotlin.math.abs

class Box<T : Fruit> {
    private val fruitStorage = mutableListOf<T>()

    val weight: Float
        get() = if (fruitStorage.isNotEmpty()) {
            fruitStorage.size * fruitStorage.first().weight
        } else 0f

    fun compare(another: Box<*>) =
        abs(weight - another.weight) < 0.00001

    operator fun plusAssign(fruit: T) {
        fruitStorage += fruit
    }

    operator fun plusAssign(fruit: Iterable<T>) {
        fruitStorage += fruit
    }

    fun moveTo(another: Box<T>) {
        another += fruitStorage
        fruitStorage.clear()
    }
}