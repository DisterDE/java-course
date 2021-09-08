package com.kachalov.gu.android.java.lesson7

import kotlin.random.Random.Default.nextBoolean
import kotlin.random.Random.Default.nextInt

fun main() {
    val cats = arrayOf(
        Cat("7SbI4e"),
        Cat("YB98g"),
        Cat("0UQgE5La"),
        Cat("mi1HV")
    )

    val plate = Plate(nextInt(50))

    cats.forEach {
        if (nextBoolean()) {
            plate.increaseFood(nextInt(10))
        }
        try {
            it.eat(plate)
            it.info()
        } catch (e: RuntimeException) {
            println(
                """${it.name} says:
                |${e.message}
                """.trimMargin()
            )
        }
    }
}