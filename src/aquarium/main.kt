package aquarium

import spices.SimpleSpice
import spices.Spice

fun main(arr:Array<String>){

    val simpleSpice = SimpleSpice()
    println("${simpleSpice.name} -> ${simpleSpice.heat}")

    val list: List<Spice> = listOf<Spice>(Spice(name = "curry", spiciness = "hot"), Spice(name = "blurry", spiciness = "hot"),
        Spice("jerry", "mild"), makeSalt(), Spice())

    val listSpice = list.filter { it.heat > 5 }

    listSpice.forEach { println("${it.name} -> ${it.heat}") }
}

fun makeSalt() = Spice(name = "salt", spiciness = "none")