package com.kachalov.gu.android.java.lesson9

import com.kachalov.gu.android.java.lesson9.exception.MyArrayDataException
import com.kachalov.gu.android.java.lesson9.exception.MyArraySizeException
import java.lang.NumberFormatException

fun main() {
    val arr = arrayOf(
        arrayOf("1", "1", "1", "1"),
        arrayOf("1", "1", "1", "1"),
        arrayOf("1", "1", "a", "1"),
        arrayOf("1", "1", "1", "1"),
    )

    println(calculateSumOfMatrix(arr))
}

fun calculateSumOfMatrix(arr: Array<Array<String>>): Long {
    validateSize(arr)
    validateData(arr)

    return arr.flatten().sumOf { it.toLong() }
}

fun validateData(arr: Array<Array<String>>) {
    for ((row, subArr) in arr.withIndex()) {
        for ((column, v) in subArr.withIndex()) {
            try {
                v.toInt()
            } catch (e: NumberFormatException) {
                throw MyArrayDataException(row, column)
            }
        }
    }
}

fun <T> validateSize(arr: Array<Array<T>>) {
    if (arr.isEmpty() || arr.size != 4) {
        throw MyArraySizeException(arr.size, arr[0].size)
    }

    if (arr.any { it.size != 4 }) {
        throw MyArraySizeException(arr.size, arr[0].size)
    }
}
