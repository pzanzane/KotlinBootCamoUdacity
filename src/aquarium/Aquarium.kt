package aquarium

class Aquarium(var width: Int, var height: Int ,val length: Int) {

    var volume: Int
    get() = width * height * length /1000
    set(value) {height = (value*1000) / (width * length)}
}