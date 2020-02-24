fun main(array: Array<String>){

    for(index in 1..10){
        val fortune = getFortuneCookie(getBirthday())
        println("Your fortune is: $fortune")

        if(fortune.contains("Take it easy")){
            break
        }
    }
}

fun getBirthday():Int{

    println("Enter Birthday")
    return readLine()?.toIntOrNull() ?: 1
}
fun getFortuneCookie(birthday: Int): String{


    val list = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    return when (birthday){
        28,31 -> list[0]
        in 1..7 -> list[1]
        else -> {
            list[birthday.rem(list.size)]
        }
    }
}