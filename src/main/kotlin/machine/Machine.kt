package machine

import resource.Resource
import java.lang.Error
import Fuel

abstract class Machine(val name: String, private var fuel: List<Fuel> = listOf(), private val weight: Double) {
	var Fuel: List<Fuel>
		set(addition: List<Fuel>) {
			fuel = fuel + addition
		}
		get() = fuel

	fun work(target: Resource): Array<Fuel> {
		val fuelCost = target.HitPoints * weight;

		if (fuelCost > fuel.count()) {
			throw Error("Not enough fuel! $name has $fuel, needs $fuelCost")
		}

		for (fuelItem in fuel) {
			fuelItem.burn()
		}

		return target.extract()
	}

	fun greet() {
		println("${javaClass.name} $name has $fuel, and weighs $weight")
	}
}
