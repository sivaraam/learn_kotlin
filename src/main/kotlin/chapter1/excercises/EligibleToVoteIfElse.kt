package chapter1.excercises

fun main() {
    print("Enter a age to check vote eligibility: ")
    val age = readln().toInt()

    if (age >= 0 && age < 18) {
        println("You are not eligible to vote.")
    }
    else if (age >= 18 && age <= 120) {
        println("You are eligible to vote.")
    }
    else {
        println("Please enter a valid age.")
    }
}