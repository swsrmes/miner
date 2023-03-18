package resource

import Fuel

abstract class Resource (name: String, private val hitPoints: Int) {
    val HitPoints: Int
        get() =  hitPoints

    abstract fun extract(): Array<Fuel>
}