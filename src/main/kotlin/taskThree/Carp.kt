package taskThree

class Carp(swimSpeed: Double) : Fish(swimSpeed) {
    override val totalSpeed: Double
        get() = super.totalSpeed

    override fun swim() {
        println("I am a Carp, and i swimming")
    }
}