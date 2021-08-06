package com.kachalov.gu.android.java.lesson2

import kotlin.math.abs

// task1
fun IntArray.invert() =
    map { it xor 1 }.toIntArray()

// task2
fun IntArray.fillWithDividersOf3() =
    mapIndexed { i, _ -> i * 3 }.toIntArray()

// task3
fun IntArray.multiplyLowNumbersBy2(maxValue: Int) =
    filter { it < maxValue }.map { it * 2 }.toIntArray()


// task4
fun Array<IntArray>.fillDiagonals() {
    var left = 0
    var right = this.size - 1
    for (i in this) {
        i[left++] = 1
        i[right--] = 1
    }
}

// task5
fun IntArray.findMinAndMax() = minOrNull() to maxOrNull()

// task6
fun IntArray.isBalanced(): Boolean {
    var currentSum = 0
    var sum = sum()
    var currentIndex = 0
    while (currentSum < sum) {
        currentSum += this[currentIndex]
        sum -= this[currentIndex]
        currentIndex++
    }
    if (currentSum == sum) {
        return true
    }
    return false
}

// task7
fun IntArray.moveTo(stepCount: Int) {
    if (stepCount == 0) {
        return
    }
    var steps = stepCount % size
    if (abs(steps) > size / 2) {
        steps = if (steps < 0) size - abs(steps) else -(size - steps)
    }
    for (i in 1..abs(steps)) {
        if (steps < 0) {
            val temp = this[0]
            System.arraycopy(this, 1, this, 0, this.size - 1)
            this[lastIndex] = temp
        } else {
            val temp = this[lastIndex]
            System.arraycopy(this, 0, this, 1, this.size - 1)
            this[0] = temp
        }
    }
}

private fun createMatrix(size: Int) = Array(size) { IntArray(size) }

private fun Array<IntArray>.mapToString() = joinToString(separator = "\n") { it.joinToString() }
