package practice

import java.util.*

fun main(arr: Array<String>) {
    val day = randomDay()
    println("Today is $day feed the fish with ${fishFood(day)}")

    if(shouldChangeTheWater("Tuesday")) {
        println("Time to change the water")
    }

    println("Can add Fish ${canAddFish(10.0, arrayOf(3, 3, 3))}")
    println("Can add Fish ${canAddFish(8.0, arrayOf(2, 2, 2), hasDecoration = false)}")
    println("Can add Fish ${canAddFish(9.0, arrayOf(1, 2, 3), 3)}")
    println("Can add Fish ${canAddFish(10.0, arrayOf(), 7, true)}")

}

fun randomDay(): String {
    val week = listOf<String>("Monday", "Tuesday", "Wednsday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String) : String {
    return when(day) {
        "Monday" -> "Food1"
        "Tuesday" -> "Food2"
        "Wednsday" -> "Food3"
        "Thursday" -> "Food4"
        "Friday" -> "Food5"
        "Saturday" -> "Food6"
        else -> "Fasting"
    }
}

private fun shouldChangeTheWater(day: String, temperature: Int = 20, dirty: Int = 10) : Boolean {
    return true
}

private fun canAddFish(tankSizeInGallon: Double,
                       currentFish: Array<Int>,
                       fishSize: Int = 2,
                       hasDecoration: Boolean = true): Boolean {

    val existingFishSize = currentFish.sum().plus(fishSize)

    val tank = if(hasDecoration) tankSizeInGallon.times(80).div(100) else tankSizeInGallon
    return existingFishSize <= tank
}