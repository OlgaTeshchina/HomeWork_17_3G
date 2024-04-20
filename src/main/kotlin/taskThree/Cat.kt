package taskThree

open class Cat: Pet(), Runnable, Swimmable {
    override var runSpeed = 0.0
    override var swimSpeed = 0.0

    override val totalSpeed: Double
        get() {return  this.runSpeed + this.swimSpeed}

    override fun run() {
        println("I am a Cat, and i running")
    }

    override fun swim() {
        println("I am a Cat, and i swimming")
    }
}