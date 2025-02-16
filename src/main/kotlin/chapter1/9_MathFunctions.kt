package chapter1

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    /*
     * Built-in functions
     */
    val hundred = 100.0
    val base = 3.14159
    val power = 3.14159

    println("Square root of ${hundred} is: ${sqrt(hundred)}")
    println("${base} raised to power of ${power} is: ${base.pow(power)}")

    /*
     * Single-line expressions and function overloading
     */
    fun add(x: Int, y: Int) = x + y

    fun add(x: Double, y: Double) = x + y

    println("Sum of 5 and 6 is: ${add(5, 6)}")
    println("Sum of ${base} and ${power} is: ${add(base, power)}")
}

