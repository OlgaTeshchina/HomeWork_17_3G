package taskThree

class Lion(runSpeed: Double, swimSpeed: Double) : Cat(runSpeed, swimSpeed) {
    override fun swim() {
        println("I am a Lion, and i swimming")
    }

    override fun run() {
        println("I am a Lion, and i running")
    }
}