package spices

fun main(arr: Array<String>) {
    val grinder = MixerGrinder
    val spice = Curry("curry", "mild", grinder)
    spice.prepareSpice()
}

sealed class AbstractSpice(name:String,
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
        println("Preparing ${color.name} curry")
    }
}

interface Grinder {
    fun grind()
}

interface CurryColor {
    val color: Color
}

object YellowColor : CurryColor {
    override val color: Color = Color.YELLOW
}

object MixerGrinder: Grinder {
    override fun grind() {
        println("Grinding")
    }
}

enum class Color(rgb:Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00)
}