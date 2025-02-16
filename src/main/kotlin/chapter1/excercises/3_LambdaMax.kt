package chapter1.excercises

fun main() {
    val max = { x: Int, y: Int -> if (x >= y) x else y }

    println("Max of 5 and 6 is: ${max(5, 6)}")
    println("Max of 101 and 101 is: ${max(101, 101)}")
    println("Max of -102 and -101 is: ${max(-102, -101)}")
}