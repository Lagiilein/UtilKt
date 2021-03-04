package com.github.lagiilein.utilkt.challenges

/**
 * [https://www.hackerrank.com/challenges/time-conversion]
 */
fun convert12HourTimeToMilitary(s: String): String {
    val out = StringBuilder()

    var hours = s.split(":")[0].toInt()

    if (s.substring(s.length - 2).toLowerCase() == "pm" && hours != 12)
        hours += 12

    if (s.substring(s.length - 2).toLowerCase() != "pm" && hours == 12)
        hours -= 12

    out.append(if (hours < 10) "0$hours" else hours)
    out.append(":")
    out.append(s.split(":")[1])
    out.append(":")
    out.append(s.split(":")[2].substring(0, s.split(":")[2].length - 2))


    return out.toString()
}
