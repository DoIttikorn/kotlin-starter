package main.kotlin.basic


/*
Arrays in Kotlin are invariant. This means that Kotlin does not
let us assign an Array<String> to an Array<Any>, which prevents
a possible runtime failure
(but you can use Array<out Any>, see Type Projections)

https://kotlinlang.org/docs/generics.html#type-projections

*/
fun arrayBasic() {
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }
    primitiveTypeArrays()
}

fun primitiveTypeArrays() {
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    x.forEach { print("$it ") }
}
