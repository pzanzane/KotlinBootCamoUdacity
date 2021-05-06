package practice

fun main(arr: Array<String>) {
    val birthday = getBirthday
    val fortune = fortuneCookie(birthday)
    println("Your fortune for the Birthday $birthday $fortune")
}

fun fortuneCookie(dayOfTheMonth: Int): String {
    val fortunes = arrayOf("Fortune1", "Fortune2", "Fortune3", "Fortune4", "Fortune5", "Fortune6")
    return when(dayOfTheMonth) {
        28,31 -> fortunes[fortunes.size - 1]
        in 1..7 -> fortunes[1]
        else -> fortunes[dayOfTheMonth/fortunes.size]
    }
}

private val getBirthday: Int
    get() {
        println("Enter the birthday")
        return readLine()?.toIntOrNull() ?: 1
    }
