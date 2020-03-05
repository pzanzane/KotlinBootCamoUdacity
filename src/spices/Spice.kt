package spices

class Spice(var name: String, val spiciness: String = "mild") {

    constructor(): this(name = "curry")

    val heat: Int
        get() = when(spiciness) {"mild" -> 5 "hot" -> 10 else->0}

    init {
        println("Spice -> ${name}")
    }
}