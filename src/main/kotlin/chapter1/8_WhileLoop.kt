package chapter1

fun main() {
    var count = 0;
    while (true) {
        println("Current value of count: ${count++}")
        if (count >= 7) break
    }
}