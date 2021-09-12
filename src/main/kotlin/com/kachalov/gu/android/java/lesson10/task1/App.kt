package com.kachalov.gu.android.java.lesson10.task1

fun main() {
    val words = arrayOf(
        "U4MA6y5",
        "9o2Djn",
        "0tRu",
        "0tRu",
        "TMcn1J",
        "a5Hl",
        "3V6Vfq",
        "3V6Vfq",
        "UTE9jjJ",
        "ugUebf2",
        "fMGBaS",
        "1p3yt",
        "1p3yt",
        "v66",
        "0Sht1DK9",
        "0Sht1DK9",
        "7Mq664CT",
        "A127DIy",
        "A127DIy",
        "7GLez21",
    )

    val wordsMap = words.groupBy { it }
        .mapValues { it.value.size }

    println("Unique words: ")
    println(wordsMap.keys.joinToString(separator = " "))
    println("====================================")
    println(wordsMap.entries.joinToString(separator = "\n") { "${it.key}: ${it.value}" })
}