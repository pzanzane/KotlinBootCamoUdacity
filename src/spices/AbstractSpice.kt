package spices

fun main(arr: Array<String>) {
    val grinder = MixerGrinder
    val spice = Curry("curry", "mild", grinder)
    spice.prepareSpice()
}

abstract class AbstractSpice(name:String,
                             curryColor: CurryColor,
                             level:String = "mild") : CurryColor by curryColor {
    abstract fun prepareSpice()
}

class Curry(name: String,
            level:String,
            grinder: Grinder,
            curryColor: CurryColor = YellowColor) :
    AbstractSpice(name, curryColor, level),
    Grinder by grinder{
    override fun prepareSpice() {
        println("Preparing ${color} curry")
    }
}

interface Grinder {
    fun grind()
}

interface CurryColor {
    val color: String
}

object YellowColor : CurryColor {
    override val color: String = "Yellow"
}

object MixerGrinder: Grinder {
    override fun grind() {
        println("Grinding")
    }
}