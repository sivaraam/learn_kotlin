package chapter1/* This is a multiline comment
   used for providing useful tips or reminders. */

/**
 * This is a simple method that returns a greeting
 * string for a user.
 *
 * @param name The name of the person
 * @return The greeting string
 */
fun greet(name: String): String {
    return "Hello, $name!"
}

fun main() {
    val name = "John Sinclair"
    val age = 30

    println(greet(name))
    println("$name is $age years old")
}