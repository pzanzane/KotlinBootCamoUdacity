package collections

fun main(arr:Array<String>) {

    val allBooks = setOf("Book Title 1", "Book Title 2", "Book Title 3", "Book Title 4", "Book Title 5", "Book Title 6")
    val library = mapOf("Hamlet" to allBooks)

    println("Do we have Hamlet ${library.any { it.key == "Hamlet" }}")

    val moreBooks = mutableMapOf("Book Title 1" to "Hamlet")
    moreBooks.getOrPut("Book Title 2") { "Hamlet" }

    moreBooks.forEach { t, u -> println("$t - $u") }

}