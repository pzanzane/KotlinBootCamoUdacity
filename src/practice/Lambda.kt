package practice

import java.lang.StringBuilder
import java.util.*

fun main(arr: Array<String>) {
val rollDice: (Int) -> Int = { numberOfSides -> if(numberOfSides <=0) 0 else Random().nextInt(numberOfSides) + 1 }
repeat(10){
    println("Dice Roll ${rollDice(12)}")
}

repeat(12) {
    gamePlay(rollDice)
}

println("This is negate ${negate<String>{ str -> str.length > 10  }("HelloHelloHello")}")

capitals()

}

// Lambda
val rollDice: (Int) -> Int = { numberOfSides -> if(numberOfSides <=0) 0 else Random().nextInt(numberOfSides) + 1 }

// Function, we can use as function pointer (::FunctionName)
fun rollDice2(numberOfSides: Int) = if(numberOfSides <=0) 0 else Random().nextInt(numberOfSides) + 1

// Higher Order function, Takes Lambda as a paramter
fun gamePlay(rollDice: (Int) -> Int ) {
    print("Dice Roll ${rollDice(12)} || ")
}

// TO invoke lambda in function use .invoke
fun <T> negate(f: (T) -> Boolean): (T) -> Boolean = {T -> !f.invoke(T)}

// Destructuring im lambda
fun capitals(): Unit {
    val countries = mapOf("France" to "Paris", "Germany" to "Berlin", "Spain" to "Madrid", "Italy" to "Rome")
    countries.mapValues { (country,capital) -> println("$country ->  $capital") }
}