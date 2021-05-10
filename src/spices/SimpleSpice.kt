package spices

fun main(arr: Array<String>) {
    val spice = listOf<Spice>(Spice(name = "curry"),
        Spice(name = "curry2", level = "hot"),
        Spice(name = "curry3", level = "hot"),
        Spice(name = "curry4", level = "medium"),
        Spice(name = "curry5", level = "mild"))

    spice.filter { it.heat < 5 }.toList().forEach { item -> println("Spices ${item.name} -> ${item.heat}")}
}