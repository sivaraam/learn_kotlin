package chapter1

fun main() {
//    val x = 5f;
    val x = Float.NaN
//    val x = Float.POSITIVE_INFINITY

    when {
        x > 0 -> println("x is positive")
        x == 0f -> println("x is zero")
        x < 0 -> println("x is negative")
        else -> println("x is not a real number")
    }

//    val hour = 13
//    val hour = 24f;
    println("Enter an hour (0-23): ")
    val hour = readln().split(' ').map(String::toInt).get(0)

    when (hour) {
        in 0..11 -> println("Good morning!")
        in 12..16 -> println("Good afternoon")
        in 17..20 -> println("Good evening")
        in 20..23 -> println("Good night")
        else -> println("Invalid hour")
    }
}