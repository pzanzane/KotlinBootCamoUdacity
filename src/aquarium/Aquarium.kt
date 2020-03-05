package aquarium

class Aquarium(var width: Int = 100, var height: Int = 30, var length:Int = 70) {

    val volume: Int
        get()= width * height * length / 1000
}