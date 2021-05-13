package buildings

open class BaseBuildingMaterial(open val numberNeeded:Int = 1)

class Wood(): BaseBuildingMaterial(4)

class Brick(): BaseBuildingMaterial(8)

class Building<out T: BaseBuildingMaterial>(val buildingMaterial: T,
                                        baseMaterialNeeded: Int = 100) {
    val actualMaterialNeeded = buildingMaterial.numberNeeded * baseMaterialNeeded

    fun build() {
        println("Material type ${buildingMaterial::class.simpleName} numberNeeded $actualMaterialNeeded")
    }
}

fun <T: BaseBuildingMaterial>isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialNeeded < 500)
        println("Small building")
    else
        println("Large building")
}

fun main() {
    val building = Building(Brick())
    building.build()

    isSmallBuilding(building)
}