package main.kotlin.basic

fun conditions() {
    ifCondition()
    whenCondition()
}

fun ifCondition() {
    // As expression
    val value = if (4 > 3) true else false
    println(value)

    val max = if (3 > 5) {
        println("choose 3")
        3
    } else {
        println("choose 5")
        5
    }

    println(max)
}

fun whenCondition() {
    val x = 2
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("x neither 1 nor 2")
        }
    }


    //when has a subject of an Boolean, enum, or sealed type, or their nullable counterparts.
    when (Color.RED) {
        Color.RED -> println("red")
        Color.GREEN -> println("green")
        Color.BLUE -> println("blue")
        // 'else' is not required because all cases are covered
    }
    //branches of when don't cover all possible cases for this subject.
    when (Color.GREEN) {
        Color.RED -> println("red") // no branches for GREEN and BLUE
        else -> println("not red") // 'else' is required
    }

    //    You can also check a value for being in or !in a range or a collection:
    val validNumbers = arrayOf(13, 20)
    when (x) {
        in 1..10 -> print("x is in the range")
        in validNumbers -> print("x is valid")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
}


enum class Color {
    RED, GREEN, BLUE
}