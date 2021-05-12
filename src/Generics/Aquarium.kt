package Generics

class Aquarium<T: WaterSupply>(val waterSupply: T) {
    fun safetyCheck() {
        check(!waterSupply.needsProcessing) { "Water still not processed" }

        println("Can add fish")
    }
}

open class WaterSupply(var needsProcessing: Boolean)

class TapWater() : WaterSupply(true) {
    fun addChemicals() {needsProcessing = false}
}

class LakeWater() : WaterSupply(true) {
    fun filter() {needsProcessing = false}
}

class FishStoreWater: WaterSupply(false)

fun main() {
    val aquarium = Aquarium(TapWater())
    aquarium.waterSupply.addChemicals()
    aquarium.safetyCheck()
}