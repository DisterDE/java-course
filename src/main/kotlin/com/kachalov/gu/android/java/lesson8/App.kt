package com.kachalov.gu.android.java.lesson8

import com.kachalov.gu.android.java.lesson8.competitor.Cat
import com.kachalov.gu.android.java.lesson8.competitor.Human
import com.kachalov.gu.android.java.lesson8.competitor.Robot
import com.kachalov.gu.android.java.lesson8.obstacle.Treadmill
import com.kachalov.gu.android.java.lesson8.obstacle.Wall

fun main() {
    val competitors = arrayOf(
        Cat("qBu"),
        Robot("8Cn"),
        Human("XfG26Rq1")
    )

    val obstacles = arrayOf(
        Treadmill(),
        Wall()
    )
    for (obstacle in obstacles) {
        for (competitor in competitors) {
            if (competitor.onDistance) {
                obstacle.overcome(competitor)
            }
        }
    }
}