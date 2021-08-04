package com.kachalov.gu.android.java.lesson1

import java.time.Year

// task1
fun main() {
    createAllVariablesAndShowYourTeacherThatYouAreNotUselessAsShit()
    println(calculateFantasticExpression(1.0f, 2.0f, 3.0f, 4.0f))
    println(pretendLikeYouCanCalculateHarderExpressionThanThatOneFromPreviousTask(5, 10))
    printSomethingInterestingOrNotAboutNextNum(-5)
    println(callSomebodyToTellHimAStoryAboutThisNum(10))
    makeTheyThinkThatTheirLifeMatterSomething("Andrew")
    sayPleaseThoseGuysWhichThisYearIsAndMaybeYouWillLookClever(2020)
}

// task2
fun createAllVariablesAndShowYourTeacherThatYouAreNotUselessAsShit() {
    var b: Byte = 1
    var s: Short = 2
    var i: Int = 3
    var l: Long = 4L

    var f: Float = 1.0f
    var d: Double = 2.0

    var c: Char = 'j'
    var str: String = "I'm sexy and I know it"
}

// task3
fun calculateFantasticExpression(a: Float, b: Float, c: Float, d: Float) = a * (b + (c / d))

// task4
fun pretendLikeYouCanCalculateHarderExpressionThanThatOneFromPreviousTask(a: Int, b: Int) =
    a + b in 10..20

// task5
fun printSomethingInterestingOrNotAboutNextNum(num: Int) {
    println(if (num.isNegative()) "Negative" else "Positive")
}

// task5 && task6 additional function
private fun Int.isNegative() = this < 0

// task6
fun callSomebodyToTellHimAStoryAboutThisNum(num: Int) = num.isNegative()

// task7
fun makeTheyThinkThatTheirLifeMatterSomething(name: String) {
    println("Hello, $name! You are so beautiful today.")
}

// task8
fun sayPleaseThoseGuysWhichThisYearIsAndMaybeYouWillLookClever(year: Long) {
    println(
        buildString {
            append("Year $year is ")
            if (!year.isLeap()) {
                append("not ")
            }
            append("leap!")
        }
    )
}

// task8 additional function
// looks like ama cheater but not, ama gangster
private fun Long.isLeap() = Year.isLeap(this)

//Auf Wiedersehen