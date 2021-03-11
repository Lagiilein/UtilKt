package com.github.lagiilein.utilkt.challenges

private const val ANSWER_YES = "YES"
private const val ANSWER_NO = "NO"

/**
 * [https://www.hackerrank.com/challenges/kangaroo]
 */
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    // check if the kangaroo could possibly catch up
    if (x1 > x2) {
        if (v1 >= v2)
            return ANSWER_NO
    }

    if (x2 > x1) {
        if (v2 >= v1)
            return ANSWER_NO
    }

    // calculate jumps
    val jumps = if (v1 > v2)
        calculateJump(x1, v1, x2, v2)
    else
        calculateJump(x2, v2, x1, v1)

    return if (jumps == -1)
        ANSWER_NO
    else
        ANSWER_YES
}

/**
 * [https://www.hackerrank.com/challenges/kangaroo]
 *
 * calculate the number of jumps.
 *
 * v1 must be faster than v2.
 *
 * @param x1 Start position of first (the faster one)
 * @param v1 Rate of meters per jump of first (the faster one)
 * @param x2 Start position of second (the slower one)
 * @param v2 Rate of meters per jump of second (the slower one)
 *
 * @return amount of jumps or -1 when not possibly
 */
fun calculateJump(x1: Int, v1: Int, x2: Int, v2: Int): Int {
    var currentJump = 0
    var current1 = x1
    var current2 = x2

    while(current1 <= current2) {
        if (current1 == current2)
            return currentJump

        currentJump++
        current1 += v1
        current2 += v2
    }

    return -1
}
