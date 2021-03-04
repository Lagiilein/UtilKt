package com.github.lagiilein.utilkt.challenges

/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles
 */
fun countHighestValueAmount(candles: Array<Int>): Int {
    var amount = 0
    var highest = Int.MIN_VALUE

    candles.forEach {
        if (it > highest) {
            amount = 1
            highest = it
        } else if (it == highest) {
            amount++
        }
    }

    return amount
}
