package main.kotlin.basic

fun characters() {
    /*
        \t – tab
        \b – backspace
        \n – new line (LF)
        \r – carriage return (CR)
        \' – single quotation mark
        \" – double quotation mark
        \\ – backslash
        \$ – dollar sign
    */
    val aChar = 'a'

    println(aChar)
    println('\$') // Prints an extra newline character
    println('\uFF00')
}