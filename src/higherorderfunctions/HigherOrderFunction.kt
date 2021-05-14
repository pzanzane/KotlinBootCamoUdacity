package higherorderfunctions

enum class Directions {
    NORTH,
    SOUTH,
    EAST,
    WEST,
    START,
    END
}

class Game(var path: MutableList<Directions> = mutableListOf(Directions.START)) {
    val north: () -> Unit = {path.add(Directions.NORTH)}
    val south: () -> Unit = {path.add(Directions.SOUTH)}
    val east: () -> Unit = {path.add(Directions.EAST)}
    val west: () -> Unit = {path.add(Directions.WEST)}
    val end: () -> Boolean = {
        path.add(Directions.END)
        println("Game Over")
        println("${path}")
        path.clear()
        false
    }
    val map = Array(4) { arrayOfNulls<String>(4)}

    fun move(where: () -> Unit) {
        println("In Move")
        where()
    }

    fun makeMove(str: String?) {
        when(str) {
            Directions.NORTH.name -> move(north)
            Directions.SOUTH.name -> move(south)
            Directions.EAST.name -> move(east)
            Directions.WEST.name -> move(west)
            Directions.END.name -> end()
        }

    }
}

fun main(arr: Array<String>) {

    val game = Game()
    do {
        println("Enter the direction: ")
        val str = readLine()?.toUpperCase()
        game.makeMove(str)
        println("${game.path}")
    }while (str !=null && !str.contentEquals(Directions.END.name))
}