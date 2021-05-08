package practice

fun main(arr: Array<String>) {
    println("I should ${whatShouldIDoToday()}")
}

fun whatShouldIDoToday(mood: String = getMood(), weather: String = "Sunny", temperature: Int = 14): String {
    return if (mood == "Happy" && weather == "Sunny" && temperature in 14..24) "Go for walk"
    else if (mood == "Happy" && weather == "Cloudy" && temperature in 14..24) "Read at home"
    else if (mood == "Sad") "Watch movie"
    else "Work"
}

fun getMood() = readLine() ?: "Sad"