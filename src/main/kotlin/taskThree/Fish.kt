package taskThree

open class Fish(override var swimSpeed: Double) : Pet(), Swimmable {

    override val totalSpeed: Double
        get() {return this.swimSpeed}

    override fun swim() {
        println("I am a Fish, and i swimming")
    }
}