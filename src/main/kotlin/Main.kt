import machine.Digger

fun main(args: Array<String>) {
//    println("Hello World!")

    println("Welcome, minah!")
	val player = Player("Ken", 100.0)
	val digger = Digger("Mike")

	println(player.greet())
	println(digger.greet())

	println("Refueling ${digger.name} with 10 fuel")
	player.refuel(digger, 10.0)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}