package com.kachalov.gu.android.java.lesson3

import kotlin.random.Random.Default.nextInt

const val MAX_NUMBER = 9

fun main() {
    do {
        guessTheNumber()
        println("Repeat the game? 1 -- yes, 0 -- no")
    } while (readNumber() == 1)
}

fun guessTheNumber() {
    val secretNumber = nextInt(MAX_NUMBER + 1)

    println("Guess the secret number. It can be from 0 to 9.")

    repeat(3) {
        println(
            when (readNumber()) {
                secretNumber -> "Got it!"
                in (0 until secretNumber) -> "Increase your number and try again."
                in (secretNumber + 1..MAX_NUMBER) -> "Decrease your number and try again."
                else -> throw IllegalArgumentException("WTF with your input, bro?")
            }
        )
    }
}

private fun readNumber() = readLine()!!.toInt()