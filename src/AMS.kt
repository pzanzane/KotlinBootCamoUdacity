import java.util.*

fun main(arr:Array<String>) {

    print("${ if(arr[0].toInt() < 12) "Good morning, Kotlin!" else "Good night, Kotlin!" }")
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