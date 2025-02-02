package chapter1

fun main() {
    println("Loop i")
    for (i in 1..4 step 3) {
        println("Current value of i: $i")
    }
    println()

    println("Loop j")
    for (j in 1 until 10 step 2) {
        println("Current value of j: $j")
    }
}
