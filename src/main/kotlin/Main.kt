fun main() {
    println("Hello World.")
    println("number of a's = " + countAs("Mary got married"))
    assignReadersToBooks()
    printStringLength("This is a test")
    printStringLength(null)
    println("Concatenation: " + concatenate("hello", null))
    exercise1()
    exercise2()
    println(exercise3(48288679))
    exercise5("Texto_de_prueba")
    assignReadersToBooks()
    println("Concatenation: " + concatenate("hello", null))


}

// TODO: 1.- Write a function called exercise1()
// that prints the numbers from 1 to 10 with
// println() and invoke it from main().
// Look for how to make a “for” loop here:
// https://kotlinlang.org/docs/reference/control-flow.html
fun exercise1() {
    // You don't need to declare the variable of the counter of the for
    for (contador in 1..10){
        println(contador)
    }
}

// TODO: 2.- Uncomment this function:
 fun exercise2() {
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
            when(month){
                1,3,5,7,8,10,12 -> println("31 days")
                4,6,9,11 -> println("30 days")
                2 -> println("28 or 29 days")
            }

        }
    }

}

// TODO: 3 Write a function called exercise3()
// that accepts a  number and returns a String
// that represents the corresponding NIF (number + letter)
// https://www.ordenacionjuego.es/en/calculo-digito-control
// https://kotlinlang.org/docs/reference/basic-types.html#arrays

fun exercise3 (dni: Int): String{
    var reminder: Int = dni % 23
    var LETTERS = arrayOf("T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S", "Q","V", "H", "L", "C", "K", "E")
    return "" + dni + LETTERS.get(reminder)
}

// TODO: 4 Modify this function abbreviating it with "=" as return type
// (simplification 2)
// https://developer.android.com/kotlin/learn#simplifying
// Note: You can remove the : Int in the declaration
/*fun countAs(str: String): Int {
    val count = str.count { c -> c == 'a' }
    return count
}*/
fun countAs(str: String): Int =
        str.count { c -> c == 'a' }


fun stringMapper(str: String, mapper: (String) -> Int): Int {
    return mapper(str)
}
// TODO 5: Write a function called exercise5()
// In it you will invoke the function stringMapper declared above twice.
// The first one with a function that returns the number of characters
// and the second one with a function that returns the number of a’s.
// Print its results.

fun exercise5(cadena: String){
    println(stringMapper(cadena,{input ->
        input.length
    }))
    println(stringMapper(cadena, {input -> countAs(input)} ))
}



data class Reader(val name: String, val age: Int)
// TODO 6: Create a data class Book that has 2 parameters
// title as a String that can not be modified (read only)
// and reader as a Reader

data class Book constructor(val title: String, var lector: Reader){
    public val titulo: String = title
    public var reader: Reader = lector


}
fun assignReadersToBooks() {
    val reader1 = Reader("John", 23)
    val reader2 = Reader("Mary", 34)
    // TODO 6: Uncomment these sentences
    val book1 = Book("The name of the wind", reader1)
    book1.reader = reader2


}


// TODO 7: Write the body of this function
// That prints the length of the string parameter.
// If the string is null, print 0
fun printStringLength(string: String?) {
    // Body
    var total: Int
    if ((string) != null) {
        total = string.length
        println(total)
    }else{
        println(0)
    }

}

// TODO 8: Write a method concatenate() that concatenates 2 Strings
// received as parameters.
// If a String is null, convert it to “”.
// This is the invocation:
fun concatenate(string1: String?,string2: String?): String {
    var cadena1 = if ((string1) == null){""}else{string1}
    var cadena2 = if ((string2) == null){""}else{string2}

    return cadena1+cadena2
}

//println("Concatenation: " + concatenate("hello", null))
