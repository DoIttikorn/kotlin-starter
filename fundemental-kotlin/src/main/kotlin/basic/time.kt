package main.kotlin.basic

import java.time.OffsetDateTime.*


fun time() {
    var timeStr = "1998-01-01T00:00:00+18:00"
    val time = parse(timeStr)
    println(time)
}