package chapter1

fun main() {
    val size = 5

    println("Square * formation")
    for (height in 1..size) {
        for (width in 1..size) {
            print("* ")
        }
        println() // Move to next line after each row
    }
    println()

    println("Triangle formation")
    height@ for (height in 1..size) {
//        println() // uncomment if using continue@height instead of break
        width@ for (width in 1..size) {
            print("$height,$width ")
            if (height ==  width) break@width
//            if (height ==  width) continue@height // Needs above println
        }
        println() // Move to next line after each row
    }
}