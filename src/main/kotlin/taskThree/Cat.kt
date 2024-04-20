package taskThree

open class Cat(override var runSpeed: Double, override var swimSpeed: Double) : Pet(), Runnable, Swimmable {

    override val totalSpeed: Double
        get() {return  this.runSpeed + this.swimSpeed}

    override fun run() {
        println("I am a Cat, and i running")
    }

    override fun swim() {
        println("I am a Cat, and i swimming")
    }
}