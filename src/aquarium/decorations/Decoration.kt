package aquarium.decorations

import spices.Spice

fun main(arr:Array<String>) {

    val decoration2 = Decoration2("Rock", "Wood", "Soil")
    println(decoration2)

    val decoration = decoration2.copy(soil = "Soil2")
    println(decoration)

    val container = SpiceContainer(Spice("Curry", "mild"))
    println(container)
}

data class Decoration(val rock:String)

data class Decoration2(val rock:String, val wood:String, val soil:String)

data class SpiceContainer(val spice: Spice, val label:String = spice.name)