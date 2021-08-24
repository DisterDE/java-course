package com.kachalov.gu.android.java.lesson6

sealed class Animal(
    private val name: String,
    private val maxRunDistance: Int,
    private val maxSwimDistance: Int
) {
    init {
        count++
    }

    fun run(distance: Int) {
        println("$name пробежал дистанцию: ${maxRunDistance >= distance}")
    }

    open fun swim(distance: Int) {
        println("$name проплыл дистанцию: ${maxSwimDistance >= distance}")
    }

    companion object {
        var count = 0
            private set
    }
}

class Cat(name: String) : Animal("Кот $name", 200, 0) {
    init {
        count++
    }

    companion object {
        var count = 0
            private set
    }
}

class Dog(name: String) : Animal("Пёс $name", 500, 10) {
    init {
        count++
    }

    companion object {
        var count = 0
            private set
    }
}
