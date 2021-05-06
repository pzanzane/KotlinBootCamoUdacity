import aquarium.Aquarium

fun main(arr:Array<String>){
    buildAquarium();
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