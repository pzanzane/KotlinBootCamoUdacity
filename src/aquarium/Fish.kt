package aquarium

class Fish(val friendly:Boolean = true, volumeNeeded:Int) {

    init {
        println("First init block")
    }

    val size: Int
    constructor(numberOfFish: Int) : this(volumeNeeded = 9) {
        println("Running secondary constructor")
    }

    init {
        if (friendly) {
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        }
    }

    init {
        println("Secondary init block")
    }

}

fun main(arr: Array<String>) {
    val fish = Fish(20)
    println("Is fish friend ${fish.friendly} it needs volume ${fish.size}")
}