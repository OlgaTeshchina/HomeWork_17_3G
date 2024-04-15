import TaskOne.CharacterCounter
import TaskThree.Carp
import TaskThree.Lion
import TaskTwo.TypeDefiner
import java.time.LocalDate

fun main() {
    runTaskOne()
    runTaskTwo()
    runTaskThree()
}

fun runTaskOne(){
    val taskOne = CharacterCounter()
    println(taskOne.countChar("ттттт", 'а'))
    println(taskOne.countChar("око за око", 'о'))
}

fun runTaskTwo(){
    val taskTwo = TypeDefiner()
    println(taskTwo.defineType("Хорошего настроения"))
    println(taskTwo.defineType(10/10))
    println(taskTwo.defineType(2))
    println(taskTwo.defineType(10.104))
    println(taskTwo.defineType(10.105))
    println(taskTwo.defineType(LocalDate.parse("2024-04-14")))
    println(taskTwo.defineType(LocalDate.parse("2006-12-23")))
    println(taskTwo.defineType(null))
    println(taskTwo.defineType(true))
}

fun runTaskThree(){
    val taskThreeCat = Lion()
    taskThreeCat.swimSpeed = 2.0
    taskThreeCat.runSpeed = 3.1

    println("Cуммарная скорость Льва ${taskThreeCat.totalSpeed}")
    println(taskThreeCat.run())
    println(taskThreeCat.swim())

    val taskThreeFish = Carp()
    taskThreeFish.swimSpeed = 2.2

    println("Cуммарная скорость Карпа ${taskThreeFish.totalSpeed}")
    println(taskThreeFish.swim())
}