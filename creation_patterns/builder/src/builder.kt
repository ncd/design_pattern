class House private constructor(
    val bedRoom: Int,
    val bathRoom: Int,
    val garageSpace: Int,
    val floor: Int,
    val size: Int
) {
    data class Builder(
        var bedRoom: Int = 0,
        var bathRoom: Int = 0,
        var garageSpace: Int = 0,
        var floor: Int = 0,
        var size: Int = 0
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
