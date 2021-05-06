package ams

import java.util.*

fun main(arr: Array<String>) {
    val day = randomDay()
    println("TOday is $day feed the fish with ${fishFood(day)}")
}

fun randomDay(): String {
    val week = listOf<String>("Monday", "Tuesday", "Wednsday", "Thursday", "Friday", "Saturday")
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