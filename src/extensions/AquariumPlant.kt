package extensions

open class AquariumPlant(val color: String, val size: Int)

class GreenPlant(): AquariumPlant("Green", 20) {
    fun helloWorld() {}
}


fun AquariumPlant.isRed() = color == "Red"

fun GreenPlant.isRed() = color == "Red"

val GreenPlant.isGreen
    get() = color == "Green"

fun main(arr: Array<String>) {
    val plat = AquariumPlant("Red", 50)

    val greenPlant = GreenPlant()

    println("${plat.isRed()} - ${greenPlant.isRed()}")
}