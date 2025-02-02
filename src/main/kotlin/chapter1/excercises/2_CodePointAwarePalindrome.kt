package chapter1.excercises

fun main() {
    println("Enter a string to check if it is a palindrome: ")
    val possiblePalindrome = readln()
    val codePoints = possiblePalindrome.codePoints().toArray()
    val strCodePoints = codePoints.size
    val checkStringUpto = strCodePoints / 2
    var i = 0
    var j = strCodePoints - 1

    while (i <= checkStringUpto) {
        val frontCodePoint = codePoints.get(i)
        val backCodePoint = codePoints.get(j)

        if (frontCodePoint == backCodePoint) {
            i++; j--
            continue
        }
        else {
            break
        }
    }

    if (i >= j) {
        println("Palindrome")
    }
    else {
        println("Not a palindrome")
    }
}