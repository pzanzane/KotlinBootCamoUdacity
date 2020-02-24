import java.util.*

fun main(arr:Array<String>) {

    feedTheFish()
}

fun dayOfTheWeek(){

    val dayOfTheWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

    print(when(dayOfTheWeek){
        Calendar.SUNDAY ->
            "This is Sunday"
        Calendar.MONDAY ->
            "This is Monday"
        Calendar.TUESDAY ->
            "This is Tuesday"
        Calendar.WEDNESDAY ->
            "This is Wednsday"
        Calendar.THURSDAY ->
            "This is Thursday"
        Calendar.FRIDAY ->
            "This is Friday"
        Calendar.SATURDAY ->
            "This is Saturday"
        else -> "It's the D day!"
    })

}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)

    println("This is $day and fish eats $food")

    if(shouldChangeWater(day)){
        println("Change the water for Fish Tank")
    }

}
fun randomDay(): String{

    val list = listOf("MONDAY","TUESDAY","WEDNSDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY")
    return list[Random().nextInt(7)]

}

fun fishFood(day: String): String{

    return when(day){
        "MONDAY" -> "flakes"
        "WEDNSDAY" -> "pelletes"
        "FRIDAY" -> "redworms"
        "SUNDAY" -> "redworms"
        else -> {
            "algae"
        }
    }
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean{

    return when(day){
        "FRIDAY" -> true
        "TUESDAY" -> true
        else -> false
    }

}