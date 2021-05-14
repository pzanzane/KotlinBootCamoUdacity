import aquarium.Aquarium
import java.util.*

val random : Int
    get() = Random().nextInt()

val random2 : Int = Random().nextInt()

lateinit var value: Aquarium

val value2: Aquarium by lazy { Aquarium(1,1,1) }

fun main(arr:Array<String>){
    repeat(5) {
        println("Random $random")
    }

    repeat(5) {
        println("Random2 $random2")
    }
}

fun buildAquarium() {
    val aquarium = Aquarium(10, 20, 30)
    println(aquarium.volume)
}

fun array() {
    val number = arrayOf(11,12,13,14,15)
    val strArr = mutableListOf<String>()
    for(element in number) {
        strArr.add(element.toString())
    }

    for(element in strArr) {
        println(element)
    }

    for(element in 0..100 step 7) {
        println(element)
    }
}