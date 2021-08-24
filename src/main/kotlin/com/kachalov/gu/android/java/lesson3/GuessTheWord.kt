package com.kachalov.gu.android.java.lesson3

import kotlin.random.Random.Default.nextInt

val words = arrayOf(
    "apple",
    "orange",
    "lemon",
    "banana",
    "apricot",
    "avocado",
    "broccoli",
    "carrot",
    "cherry",
    "garlic",
    "grape",
    "melon",
    "leak",
    "kiwi",
    "mango",
    "mushroom",
    "nut",
    "olive",
    "pea",
    "peanut",
    "pear",
    "pepper",
    "pineapple",
    "pumpkin",
    "potato"
)

fun main() {
    guessTheWord()
}

fun guessTheWord() {
    val secretWord = words[nextInt(words.size)]

    while (true) {
        println("Guess the secret word!")
        val input = readWord()
        if (input == secretWord) {
            println("The secret word is $secretWord. Congrats!")
            return
        }
        val result = input.zip(secretWord)
        println(buildString {
            repeat(15) { append("#") }
            result.forEachIndexed { index, pair ->
                if (pair.first == pair.second) {
                    set(index, pair.first)
                }
            }
        })
    }
}

private fun readWord() = readLine()!!.lowercase()