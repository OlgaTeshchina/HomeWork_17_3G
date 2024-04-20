package taskThree

class Tuna(swimSpeed: Double) : Fish(swimSpeed) {
    override val totalSpeed: Double
        get() = super.totalSpeed

    override fun swim() {
        println("I am a Tuna, and i swimming")
    }
}