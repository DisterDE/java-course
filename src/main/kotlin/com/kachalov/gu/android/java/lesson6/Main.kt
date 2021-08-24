package com.kachalov.gu.android.java.lesson6

import kotlin.random.Random.Default.nextInt

fun main() {
    val animals = arrayOf(
        Cat("5VPI9qL"),
        Cat("51i9G3m"),
        Dog("Pa5"),
        Dog("z9tDF"),
        Dog("I8j1p98")
    )


    animals.forEach {
        it.run(nextInt(1, 600))
        it.swim(nextInt(1, 15))
    }
}