package chapter1.excercises

fun main() {
    println("Enter a string to check if it is a palindrome: ")
    val possiblePalindrome = readln()
    val strLength = possiblePalindrome.length
    val checkStringUpto = strLength / 2
    var i = 0
    var j = strLength - 1

    while (i <= checkStringUpto) {
        val frontChar = possiblePalindrome.codePointAt(i)
        val backChar = possiblePalindrome.codePointAt(j)

        if (frontChar == backChar) {
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