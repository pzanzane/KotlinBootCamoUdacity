package Generics

class Aquarium<T: WaterSupply>(val waterSupply: T) {

    fun safetyCheck(cleaner: Cleaner<T>) {
        if(waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
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

interface Cleaner<T: WaterSupply> {
    fun clean(waterSupply: T)
}

class TapCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicals()
        println("Clean water")
    }
}

fun main() {
    val aquarium = Aquarium(TapWater())
    aquarium.safetyCheck(TapCleaner())

}

