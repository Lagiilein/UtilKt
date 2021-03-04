package com.github.lagiilein.utilkt.challenges

/**
 * [https://www.hackerrank.com/challenges/staircase]
 */
fun printStaircase(n: Int) {
    for (i in 1..n) {
        val s = StringBuilder()

        for (j in 1..n-i)
            s.append(" ")

        for (k in n-i+1..n)
            s.append("#")

        println(s)
    }
}
