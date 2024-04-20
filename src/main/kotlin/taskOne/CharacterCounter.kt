package taskOne

class CharacterCounter() {
    fun countChar(str: String, char: Char): String {

        val result: Int = str.count { letter ->
            letter == char
        }

        return if (result > 0) {
            "Количество символов $char в строке $str == $result"
        } else
            "Символ $char в строке $str не найден"
    }
}