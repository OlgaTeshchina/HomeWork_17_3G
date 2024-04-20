package taskThree

class Carp: Fish() {
    override val totalSpeed: Double
        get() = super.totalSpeed

    override fun swim() {
        println("I am a Carp, and i swimming")
    }
}