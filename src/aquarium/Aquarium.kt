package aquarium

class Aquarium(var width: Int, var height: Int ,val length: Int) {

    var volume: Int
    get() = width * height * length /1000
    set(value) {height = (value*1000) / (width * length)}

    private var backingField: Int = 0
    var volume2: Int
        get() = backingField
        set(value) {backingField = value * 2}
}

fun main(arr:Array<String>) {

    val aquarium = Aquarium(10, 20, 30)
    aquarium.volume2 = 10
    println(aquarium.volume2)
}