import java.util.*

val rollDice = { side: Int ->
    if (side == 0)
        0
    else
        Random().nextInt(12)}

val rollDice2: (Int) -> Int= {sides ->
    if(sides == 0)
         0
    else
         Random().nextInt(12)
}
fun gamePlay(rollOfADice: (Int) -> Int){
    println(rollOfADice(2))
}

fun main(arr:Array<String>) {

    gamePlay(rollDice)
}