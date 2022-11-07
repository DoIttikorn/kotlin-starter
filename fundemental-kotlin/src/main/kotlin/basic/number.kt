package main.kotlin.basic

fun number() {
    var a = 1
    a = 2
    val b = 1
    // b = 2 // Error

    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
    println(oneMillion)
    println(creditCardNumber)
    println(socialSecurityNumber)
    println(hexBytes)
    println(bytes)

    // no implicit widening conversions for numbers in Kotlin. For example
    // ไม่มีการเปิดขยายไปยัง type ขนาดอื่นที่ใกล้เคียงกันใน kotlin เช่น Double จะไม่เท่ากับ Int Long
    // ref https://kotlinlang.org/docs/numbers.html#explicit-number-conversions
    fun printDouble(d: Double) {
        print(d)
    }

    val i = 1
    val d = 1.0
    val f = 1.0f

    printDouble(d)
//    printDouble(i) // Error: Type mismatch
//    printDouble(f) // Error: Type mismatch

    val l = 1L + 3 // Long + Int => Long

//    types support conversions
    //toByte(): Byte
    //toShort(): Short
    //toInt(): Int
    //toLong(): Long
    //toFloat(): Float
    //toDouble(): Double

}