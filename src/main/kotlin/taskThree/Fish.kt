package taskThree

open class Fish: Pet(), Swimmable {
    override var swimSpeed = 0.0

    override val totalSpeed: Double
        get() {return this.swimSpeed}

    override fun swim() {
        println("I am a Fish, and i swimming")
    }
}