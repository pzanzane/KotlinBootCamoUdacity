package spices

fun makeSalt() = Spice(name = "Salt")

class Spice(val name:String, val level:String = "mild") {
    val heat:Int
        get() {
            return when(level){
                "hot" -> 1
                "medium" -> 3
                "mild" -> 5
                else -> 0
            }
        }

    init {
        println("Spice named $name with spiceness $level and heat ${heat}")
    }
}