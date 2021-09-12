package com.kachalov.gu.android.java.lesson11.task1

@Throws(IllegalArgumentException::class)
fun <T> Array<T>.swapElements(index1: Int, index2: Int) {
    if (index1 !in indices) {
        throw IllegalArgumentException("Array hasn't element [$index1]")
    }

    if (index2 !in indices) {
        throw IllegalArgumentException("Array hasn't element [$index2]")
    }

    if (index1 == index2) {
        throw IllegalArgumentException("Indexes are equal")
    }

    this[index1] = this[index2].also {
        this[index2] = this[index1]
    }
}