package com.kachalov.gu.android.java.lesson8.competitor

import com.kachalov.gu.android.java.lesson8.action.Jumper
import com.kachalov.gu.android.java.lesson8.action.Runner
import kotlin.random.Random.Default.nextInt

sealed class Competitor(
    val name: String,
    private val runDistance: Int,
    private val jumpHeight: Int
) : Runner, Jumper {
    var onDistance = true
        private set

    override fun run(distance: Int): Boolean {
        if (distance > runDistance) {
            onDistance = false
            return false
        }
        return true
    }

    override fun jump(height: Int): Boolean {
        if (height > jumpHeight) {
            onDistance = false
            return false
        }
        return true
    }
}

sealed class UnhumanCompetitor(
    type: String,
    name: String,
    runDistance: Int,
    jumpHeight: Int
) : Competitor(
    "$type $name",
    runDistance,
    jumpHeight
)

class Cat(
    name: String
) : UnhumanCompetitor(
    Cat::class.simpleName!!,
    name,
    nextInt(200, 700),
    nextInt(3, 9)
)

class Robot(
    name: String
) : UnhumanCompetitor(
    Robot::class.simpleName!!,
    name,
    nextInt(500, 1000),
    nextInt(7, 15)
)

class Human(
    name: String
) : Competitor(
    name,
    nextInt(300, 800),
    nextInt(2, 6)
)