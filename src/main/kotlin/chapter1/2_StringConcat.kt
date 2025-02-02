package chapter1

val a = "Hello,"
val b = "World!"

fun main() {
    // String concatenation using the '+' operator
    var c = a + " " + b
    println("Merged strings: ${c}")

    // String concatenation using the plus() method
    c = a.plus(" ").plus(b)
    println("Merged strings: ${c}")

    // String concatenation using buildString function
    c = buildString {
        append(a)
        append(" ")
        append(b)
    }
    println("Merged strings: ${c}")
}