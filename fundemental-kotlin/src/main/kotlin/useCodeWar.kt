package main.kotlin

fun mainCodeWars() {
    val a = 1
    val b = 2
    val c = 8
    val result = listOf<Int>(a * (b + c), a * b * c, a + b + c, (a + b) * c).maxOrNull() ?: 0
    println(result)

    val str = "eloquent"
    println(str.dropLast(1).drop(1))

    val str2 = "Sam HarrisF"
    println(
        str2.split(" ").map { it ->
            it.get(0)
        }.joinToString(separator = ".").uppercase()

    )

}

fun abbrevName(a: String): String {
    return ""
}