import machine.Machine
import Fuel

class Player(val name: String, private var _fuel: List<Fuel> = 0.0) {
	val Fuel: Int
		get() = _fuel.count()

	fun refuel(target: Machine, amount: Int) {
		if (amount > Fuel) {
			throw Error("$name cannot refuel ${target.name}! Needs $amount, but only has $_fuel")
		}
		val transfer = _fuel.slice(0..amount)
		this._fuel = _fuel.drop(amount)
		target.Fuel = transfer
	}

	fun greet() {
		println("Hello from ${javaClass.name} '${this.name}'! I have $_fuel")
	}
}
