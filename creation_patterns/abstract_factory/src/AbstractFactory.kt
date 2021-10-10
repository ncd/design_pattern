package design_pattern.ncd

interface CPU {
  fun name() : String
  fun core() : String
}

class Intel: CPU {
  val name = "Intel"
  val core = "4 cores"
  override fun name(): String {
    return name
  }

  override fun core(): String {
    return core
  }
}

class Qualcomm: CPU {
  val name = "Qualcomm"
  val core = "8 cores"
  override fun name(): String {
    return name
  }

  override fun core(): String {
    return core
  }
}

interface HardDisk {
  fun storage(): String
  fun type(): String
}

class HP(val storage: String): HardDisk {
  val type = "HDD"
  override fun storage(): String {
    return storage
  }

  override fun type(): String {
    return type
  }
}

class Seagate: HardDisk {
  val storage = "1TB"
  val type = "SSD"
  override fun storage(): String {
    return storage
  }
  override fun type(): String {
    return type
  }
}

enum class MachineType {
  HP,
  Mac
}


abstract class  AbstractFactory {

  companion object {
    val hpMachine: AbstractFactory = HpMachine()
    val macMachine: AbstractFactory = MacMachine()
    fun createFactory(type: MachineType): AbstractFactory {
      when (type) {
        MachineType.HP -> return hpMachine
        MachineType.Mac -> return macMachine
        else -> throw IllegalArgumentException()
      }
    } 
  }
  
  abstract fun createCPU(): CPU
  abstract fun createHD(): HardDisk
}


class HpMachine : AbstractFactory() {
  override fun createCPU(): CPU {
    return Qualcomm()
  }

  override fun createHD(): HardDisk {
    return HP("100MB")
  }
}

class MacMachine : AbstractFactory() {
  override fun createCPU(): CPU {
    return Intel()
  }

  override fun createHD(): HardDisk {
    return Seagate()
  }
}

fun main() {
  val factory = AbstractFactory.createFactory(MachineType.HP)

  println(factory.createCPU().core())
  println(factory.createHD().storage())
}