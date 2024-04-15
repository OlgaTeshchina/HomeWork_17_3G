package TaskTwo
import java.time.LocalDate
import kotlin.math.pow

class TypeDefiner {
    fun defineType(some: Any?): String {
        return when (some) {
            is String -> "Я получил тип String = ‘$some’, ее длина равна ${some.length} симв/ол/ола/ов"
            is Int -> "Я получил Int = $some, его квадрат равен ${some.toDouble().pow(2).toInt()}"
            is Double -> "Я получил Double = $some, это число округляется до ${"%.2f".format(some)}"
            is LocalDate -> "Я получил LocalData = $some, ${lessDateTinkoff(some)}"
            null -> "Объект равен null"
            else -> "Мне этот тип неизвестен"
        }
    }

    private fun lessDateTinkoff(localDate: LocalDate): String{
        val tinkoffFoundingDate = LocalDate.parse("2006-12-24")
        if(localDate.isBefore(tinkoffFoundingDate)){
            return "эта дата меньше, чем дата основания Tinkoff"
        }
        else
            return "эта дата не меньше, чем дата основания Tinkoff"
        }
}