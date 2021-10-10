package design_pattern.ncd

class House private constructor(
    val bedRoom: Int?,
    val bathRoom: Int?,
    val garageSpace: Int?,
    val floor: Int?,
    val size: Int?
) {
    data class Builder(
        var bedRoom: Int? = null,
        var bathRoom: Int? = null,
        var garageSpace: Int? = null,
        var floor: Int? = null,
        var size: Int? = null
    ) {
        fun bedRoom(bedRoom: Int) = apply { this.bedRoom = bedRoom }
        fun bathRoom(bathRoom: Int) = apply { this.bathRoom = bathRoom }
        fun garageSpace(garageSpace: Int) = apply { this.garageSpace = garageSpace }
        fun floor(floor: Int) = apply { this.floor = floor }
        fun size(size: Int) = apply { this.size = size }
        fun build() = House(bedRoom, bathRoom, garageSpace, floor, size)
    }
}

fun main() {
    val house = House.Builder()
        .bedRoom(5)
        .bathRoom(3)
        .build()
    print(house.bathRoom)
}

