package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {

        val result = mutableSetOf<String>()

        val str = StringBuilder()
        var index = 0
        var returnInd = -1
        var repeats = 0
        var currentChar: Char

        while (index < inputString.length) {
            if (inputString[index] in listOf('<', '[', '(')) {
                currentChar = inputString[index]
                returnInd = index + 1
                index++
                while (inputString[index] != findCloser(currentChar) || repeats !=0) {
                    str.append(inputString[index])
                    if(inputString[index] == currentChar) repeats++
                    if(inputString[index] == findCloser(currentChar)) repeats--
                    index++
                }
                result.add(str.toString())
                str.clear()
                index = returnInd
            }
            else index++
        }

        return result.toTypedArray()
    }

    private fun findCloser(ch: Char): Char = when (ch) {
        '[' -> ']'
        '<' -> '>'
        '(' -> ')'
        else -> ' '
    }
}