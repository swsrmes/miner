class Fuel(private val value: Int) {
    private var isBurnt = false
    // Returns an integer representing energy value
    fun burn(): Int {
        if (isBurnt) {
            throw Error("Trying to burn fuel that has already been burnt!")
        }
        isBurnt = true

        return value;
    }
}