package ams

import java.time.DayOfWeek
import java.util.*

fun main(arr: Array<String>) {
    println(if(arr[0].toInt() < 12) "Good Morning" else "Good Evening")
    println("Hello World")
    dayOfTheWeek()
}

fun dayOfTheWeek() {
    println("What day is it today")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when(day) {
        1 -> println("Sunday $day")
        2 -> println("Monday $day")
        3 -> println("Tuesday $day$day")
        4 -> println("Wednsday $day")
        5 -> println("Thursday $day")
        6 -> println("Friday $day")
        7 -> println("Saturday $day")
    }
}