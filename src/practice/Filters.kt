package practice

fun main(arr: Array<String>) {

    println("List of Spice: ${listOfSpice()}")
    println("List of Spice2: ${listOfSpiceStartWithCEndWithE()}")
    println("List of Spice3: ${listOfSpiceStartWithCEndWithESequence().toList()}")
    println("List of Spice4: ${listOfSpiceFirstThreeStartWithC().toList()}")
}

fun listOfSpice() : List<String> {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    return spices.sortedBy { it.length }
}

fun listOfSpiceStartWithCEndWithE() : List<String> {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    return spices.filter { it[0] == 'c' && it[it.length-1] == 'e' }
}

fun listOfSpiceStartWithCEndWithESequence() : Sequence<String> {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    return spices.asSequence().filter { it[0] == 'c' && it[it.length-1] == 'e' }
}

fun listOfSpiceFirstThreeStartWithC() : Sequence<String> {
    val spices = mutableListOf<String>("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    val sq: Sequence<String> = spices.subList(0,3).asSequence().filter { it[0] == 'c' }
    spices[0] = "curry22"
    return sq
}