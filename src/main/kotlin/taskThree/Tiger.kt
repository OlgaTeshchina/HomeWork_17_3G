package taskThree

class Tiger(runSpeed: Double, swimSpeed: Double) : Cat(runSpeed, swimSpeed) {
    override val totalSpeed: Double
        get() = super.totalSpeed

    override fun swim() {
        println("I am a Tiger, and i swimming")
    }

    override fun run() {
        println("I am a Tiger, and i running")
    }
}