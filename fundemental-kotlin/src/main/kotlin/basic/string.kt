package main.kotlin.basic

fun string() {
    val str = "abda 1123"
    println(str.uppercase()) // Crate new String object not mutation old object String
    println(str)
    for (c in str) {
        println(c)
    }

//    concatenate string use + (plus)
    val s: String = "asb" + 1
    println(s + "def")

    StringLiterals()
    StringTemplate()
}

fun StringLiterals() {
//    2 type
//    1 Escaped string
//    2 Raw string

//    Escaped string
    /*
    Escaping is donw in the conventional way, with a backslash (\)
     */
    val s = "Hello, world ? \n"



// Raw string
    val text = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
    """.trimIndent()
    println(text)


}

fun StringTemplate() {
    val s = "abc"
    println("$s.length is ${s.length}") // Prints "abc.length is 3"

    val price = """
    ${'$'}_9.99
    """

    println(price)
}