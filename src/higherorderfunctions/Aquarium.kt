package higherorderfunctions

data class Fish(val name: String = "Splash")

fun main() {

    var fish = Fish()
    println(fish.let { it.name + "Fish" })
    println("${fish}")

    println("${fish.apply { name.removeRange(0,1) }}")
    fish = fish.apply { name.toUpperCase() }
    println("${fish}")

    fish.also { it.name.toUpperCase() }
    println("${fish}")

    with(fish.name) {
        toUpperCase()
    }
    println("${fish}")

    // Divisible bty 3 Practice

    val list = listOf(1,2,3,4,5,6,7,8,9,0)
    println("${list.divisibleBy3 { it%3 == 0 }}")

}

fun List<Int>.divisibleBy3(block: (Int) -> Boolean): List<Int> {
    return filter { block(it) }
}
