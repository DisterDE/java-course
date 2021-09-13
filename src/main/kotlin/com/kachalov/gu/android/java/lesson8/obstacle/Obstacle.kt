package com.kachalov.gu.android.java.lesson8.obstacle

import com.kachalov.gu.android.java.lesson8.competitor.Competitor
import kotlin.random.Random.Default.nextInt

sealed interface Obstacle {
    fun overcome(competitor: Competitor)
}

class Treadmill(private val distance: Int = nextInt(350, 1000)) : Obstacle {

    override fun overcome(competitor: Competitor) {
        val success = competitor.run(distance)
        if (success) {
            println("${competitor.name} has overcome the distance")
        } else {
            println("${competitor.name} has failed the distance")
        }
    }
}

class Wall(private val height: Int = nextInt(3, 15)) : Obstacle {
    override fun overcome(competitor: Competitor) {
        val success = competitor.jump(height)
        if (success) {
            println("${competitor.name} has overcome the height")
        } else {
            println("${competitor.name} has failed the height")
        }
    }
}