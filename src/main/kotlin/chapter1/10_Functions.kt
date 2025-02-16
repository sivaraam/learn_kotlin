package chapter1

fun main() {
    // Invoking function with default values
    println("Function with default values")
    greeting("Kaartic")
    greeting("Miguel", "Hola, ")
    greeting("சிவராம்", "வணக்கம், ", "\uD83D\uDE4F")

    val x = 101.0
    val y = 202.0

    // Function referencing
    println()
    println("Function referencing")
    println("Sum of ${x} + ${y} = ${performOperation(true, x, y)}")
    println("Product of ${x} * ${y} = ${performOperation(false, x, y)}")

    // Send function as a parameter
    println()
    println("Send function as a parameter")
    welcomeKaartic(::greeting)

    // Scope function
    println()
    println("Trying scope function 'run'")
    val result = run {
        val x = 121
        val y = 232

        x + y
    }

    println("Result of 'run' function: $result")

    // Lambda function
    val greet = { name: String -> "Hello, $name!"}
    val sq: (Double) -> (Double) = { it * it }

    println()
    println("Lambda function")
    println("Greeting: ${greet("Sivaaram")}")
    println("Square of $x = ${sq(x)}")
}

/*
 * Interesting note: Naming the function as greet() will cause a conflict with the greet() function
 * in 1_HelloWorld. So, naming this greeting
 */
fun greeting(name: String, greeting: String = "Hello, ", suffix: String = "\uD83D\uDC4B") {
    println(greeting + name + " " + suffix)
}

fun mul(x : Double, y: Double): Double {
    return x * y
}

fun add(x : Double, y: Double): Double {
    return x + y
}

fun performOperation(useAdd: Boolean, x : Double, y: Double): Double {
    val operation = if (useAdd) ::add else ::mul

    return operation(x, y)
}

fun welcomeKaartic(greetFunc: (String) -> Unit) {
    greetFunc("Kaartic")
}
