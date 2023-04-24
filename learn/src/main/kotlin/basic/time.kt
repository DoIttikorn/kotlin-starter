package basic

import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter

fun time(){
    val timeStr = "2015-04-29T10:15:00.500+0000"

    val time = OffsetDateTime.parse(timeStr, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"))
    println(time)
    println(time::class.java.typeName)
}