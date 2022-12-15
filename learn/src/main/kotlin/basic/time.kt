package basic

import java.time.OffsetDateTime

fun time(){
    val timeStr = "1998-01-01T00:00:00+18:00"

    val time = OffsetDateTime.parse(timeStr)
    println(time)
    println(time::class.java.typeName)
}