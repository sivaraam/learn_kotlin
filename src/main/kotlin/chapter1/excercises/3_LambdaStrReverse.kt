package chapter1.excercises

fun main() {
    val reverseStr =
        {   it: String ->
                var reversed = ""
                for (i in it.length - 1 downTo 0) {
                    reversed += it[i]
                }

                reversed
        }

    var str = "Kotlin"
    println("Reversed string of $str: ${reverseStr(str)}")
    str = "radar"
    println("Reversed string of $str: ${reverseStr(str)}")
    str = "saippuakivikauppias"
    println("Reversed string of $str: ${reverseStr(str)}")
    str = "a man a plan a canal panama"
    println("Reversed string of $str: ${reverseStr(str)}")

}