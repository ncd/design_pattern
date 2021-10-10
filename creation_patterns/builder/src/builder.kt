data class House(val bedRoom: Int, val bathRoom: Int, val garageSpace: Int, val floor: Int, val size: Int)

class Builder {
  var bedRoom : Int = 0
  var bathRoom: Int = 0
  var garageSpace: Int = 0
  var floor: Int = 0
  var size: Int = 0

  fun setBedRoom(num: Int) = apply { this.bedRoom = num }
  fun setBathRoom(num: Int) = apply { this.bathRoom = num }
  fun setGarageSpace(num: Int) = apply { this.garageSpace = num }
  fun setFloor(num: Int) = apply { this.floor = num }
  fun setSize(num: Int) = apply { this.size = num }
  fun getHouse() = House(bedRoom, bathRoom, garageSpace, floor, size)
}

fun main() {
  val house = Builder()
    .setBedRoom(5)
    .setBathRoom(3)
    .getHouse()
  print(house.bathRoom)
}
