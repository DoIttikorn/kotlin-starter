package main.kotlin.components

fun boolean() {
    val myTrue = true
    val myFalse = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue)
}