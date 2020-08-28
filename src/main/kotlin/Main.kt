fun main() {
    println("Hello World.")
    println("number of a's = " + countAs("Mary got married"))
}

// TODO: 1.- Write a function called exercise1()
// that prints the numbers from 1 to 10 with
// println() and invoke it from main().
// Look for how to make a “for” loop here:
// https://kotlinlang.org/docs/reference/control-flow.html

// TODO: 2.- Uncomment this function:
/* fun exercise2() {
    var month = 1
    while(month != 0) {
        println("Enter the number of the month (0 to finish)")
        val monthStr = readLine()
        if (month > 0 && month <= 12) {
            month = monthStr!!.toInt() // Don't worry about the !! yet. We will study it later
            // TODO: 2 write the number of days that has that month, using the "when" structure
            // You can read about it here:
            // https://kotlinlang.org/docs/reference/control-flow.html
            // take into account that some months have 30, others 31 and one 28 or 29.
            // Invoke the function from main()
        }
    }
} */

// TODO: 3 Write a function called exercise3()
// that accepts a  number and returns a String
// that represents the corresponding NIF (number + letter)
// https://www.ordenacionjuego.es/en/calculo-digito-control
// https://kotlinlang.org/docs/reference/basic-types.html#arrays

// TODO: 4 Modify this function abbreviating it with "=" as return type
// (simplification 2)
// https://developer.android.com/kotlin/learn#simplifying
// Note: You can remove the : Int in the declaration
fun countAs(str: String): Int {
    val count = str.count { c -> c == 'a' }
    return count
}