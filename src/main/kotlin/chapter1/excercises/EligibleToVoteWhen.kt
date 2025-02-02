package chapter1.excercises

fun main() {
    print("Enter a age to check vote eligibility: ")
    val age = readln().toInt()

    when (age) {
        in 0..17 -> println("You are not eligible to vote.")
        in 18..120 -> println("You are eligible to vote.")
        else -> println("Please enter a valid age.")
    }
}