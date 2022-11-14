package main.kotlin.basic

fun check() {
    isOperator()
    demo("str")
    smartCheckWhileCondition()
    nullableString()
}

fun isOperator() {
    val obj = "sdf"

    if (obj is String) {
        println(obj.length)
    }

    if (obj !is String) { // same as !(obj is String)
        println("Not a String")
    } else {
        println(obj.length)
    }
}

fun demo(x: Any) {
    //    The compiler is smart enough to know that a cast is safe if a negative check leads to a return:
    if (x is String) {
        println(x.length) // x is automatically cast to String
    }
}

fun smartCheckWhileCondition() {
    val x = "real String !!"
    // x is automatically cast to String on the right-hand side of `||`
    if (x !is String || x.length == 0) return

    // x is automatically cast to String on the right-hand side of `&&`
    if (x is String && x.length > 0) {
        println(x.length) // x is automatically cast to String
    }
}

//nullable
fun nullableString() {
    val y = 2
    val x: String? = y as? String
//    if return success String but return failure null
    println(x)
//    https://kotlinlang.org/docs/generics.html#generics-type-checks-and-casts
}