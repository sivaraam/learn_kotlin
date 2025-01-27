package chapter1

fun main() {
    var str: String =  "Hello, World!"
    // invalid as Kotlin assumes non-null by default
//    str = null

    var nullableStr: String? = "3.14"
    printStr(nullableStr)

    // double-bang operator
    println(nullableStr!!.toFloat())

    // plus calls works on nullable string without safe-call operator
    printStr(nullableStr.plus("!"))

    // Allowed as nullableStr is nullable type
    nullableStr = null
    printStr(nullableStr)

    // plus calls works on nullable string without safe-call operator
    printStr(nullableStr.plus("!"))

    // safe-call operator alone is allowed for toInt call
    nullableStr?.toInt()

    // Elvis operator
    printStr(nullableStr?: "Default instead of null")
}

fun printStr(str: String?) {
    if (str != null) {
        println("String is non-null. Value: ${str}")
    }
    else {
        println("String is null")
    }
}