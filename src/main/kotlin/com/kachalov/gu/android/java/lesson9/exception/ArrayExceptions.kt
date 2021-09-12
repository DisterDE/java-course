package com.kachalov.gu.android.java.lesson9.exception

sealed class MyArrayException(message: String) : RuntimeException(message)

class MyArraySizeException(
    rows: Int,
    columns: Int
) : MyArrayException("Invalid size! Must be 4x4, but is ${rows}x${columns}")

class MyArrayDataException(
    rowNumber: Int,
    columnNumber: Int
) : MyArrayException("Invalid element in row $rowNumber and column $columnNumber.")