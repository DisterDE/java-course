package com.kachalov.gu.android.java.lesson2

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class SecondLessonTasksTest {

    @Test
    fun shouldInvertArrayCorrectly() {
        val array = intArrayOf(1, 0, 1, 0, 1, 0)
        val result = intArrayOf(0, 1, 0, 1, 0, 1)
        assertTrue { result.contentEquals(array.invert()) }
    }

    @Test
    fun shouldFillArrayCorrectlyWithDividersOf3() {
        val array = IntArray(8)
        val result = intArrayOf(0, 3, 6, 9, 12, 15, 18, 21)
        assertTrue { result.contentEquals(array.fillWithDividersOf3()) }
    }

    @Test
    fun shouldMultiplyNumbersLowerThanSixBy2() {
        val array = intArrayOf(1, 2, 3, 4, 5, 6)
        val result = intArrayOf(2, 4, 6, 8, 10, 6)
        assertTrue { result.contentEquals(array.multiplyLowNumbersBy2(6)) }
    }

    @Test
    fun shouldPaintDiagonalInEmptyMatrix() {
        val matrix = arrayOf(IntArray(4), IntArray(4), IntArray(4), IntArray(4))
        val result = arrayOf(
            intArrayOf(1, 0, 0, 1),
            intArrayOf(0, 1, 1, 0),
            intArrayOf(0, 1, 1, 0),
            intArrayOf(1, 0, 0, 1),
        )
        matrix.fillDiagonals()
        assertTrue { result.contentDeepEquals(matrix) }
    }

    @Test
    fun shouldFindMinAndMaxValues() {
        val array = intArrayOf(1, 2, 3, 4, 5, 6)
        val result = 1 to 6
        assertEquals(result, array.findMinAndMax())
    }

    @Test
    fun shouldVerifyBalancedArraysCorrectly() {
        val balancedArray = intArrayOf(1, 2, 3, 6)
        val unbalancedArray = intArrayOf(1, 1, 2, 1)
        assertTrue { balancedArray.isBalanced() }
        assertFalse { unbalancedArray.isBalanced() }
    }

    @Test
    fun shouldMoveArrayCorrectly() {
        val array = intArrayOf(1, 2, 3)
        array.moveTo(1)
        assertTrue { intArrayOf(3, 1, 2).contentEquals(array) }
        array.moveTo(2)
        assertTrue { intArrayOf(1, 2, 3).contentEquals(array) }
        array.moveTo(-4)
        assertTrue { intArrayOf(2, 3, 1).contentEquals(array) }
    }
}