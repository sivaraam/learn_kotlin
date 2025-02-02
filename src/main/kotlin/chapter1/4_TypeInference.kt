package chapter1

val regularInt = 42
val floatNumber = 3.14f
val longNumber = 123456789L
val intStr = "43985667"
val floatStr = "12345.869708906"
val str = "43, some extra"

fun main() {
    println("Int to Float: ${regularInt.toFloat()}")
    println("Float to Int: ${floatNumber.toInt()}")
    println("Long to Int: ${longNumber.toInt()}")
    println("Long to Float: ${longNumber.toFloat()}")
    println("Float to Long: ${floatNumber.toLong()}")
    println("Int String to Int: ${intStr.toInt()}")
    println("Float String to Double: ${floatStr.toDouble()}")
//    println("String to Int: ${str.toInt()}") // This throws
}
