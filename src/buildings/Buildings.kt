package buildings

open class BaseBuildingMaterial(open val numberNeeded:Int = 1)

class Wood(): BaseBuildingMaterial(4)

class Brick(): BaseBuildingMaterial(8)

class Building<T: BaseBuildingMaterial>(val buildingMaterial: T,
                                        baseMaterialNeeded: Int = 100) {
    val actualMaterialNeeded = buildingMaterial.numberNeeded * baseMaterialNeeded

    fun build() {
        println("Material type ${buildingMaterial::class.simpleName} numberNeeded $actualMaterialNeeded")
    }
}

fun main() {
    val building = Building(Wood())
    building.build()
}