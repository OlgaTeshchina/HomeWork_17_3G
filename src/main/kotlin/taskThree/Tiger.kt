package taskThree

class Tiger: Cat() {
    override val totalSpeed: Double
        get() = super.totalSpeed

    override fun swim() {
        println("I am a Tiger, and i swimming")
    }

    override fun run() {
        println("I am a Tiger, and i running")
    }
}