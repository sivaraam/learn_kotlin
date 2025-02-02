package chapter1.excercises

fun main() {
    println("Enter number of rows to print star pattern: ")
    val n = readln().toInt()

    for (i in 1..n) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}