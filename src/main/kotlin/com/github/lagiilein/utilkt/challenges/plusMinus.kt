package com.github.lagiilein.utilkt.challenges

/**
 * https://www.hackerrank.com/challenges/plus-minus
 */
fun plusMinus(arr: Array<Int>) {
    var positiveAmount = 0
    var negativeAmount = 0
    var zeroAmount = 0

    arr.forEach {
        if (it > 0)
            positiveAmount++
        else if (it < 0)
            negativeAmount++
        else
            zeroAmount++
    }

    println(positiveAmount.toFloat() / arr.size.toFloat())
    println(negativeAmount.toFloat() / arr.size.toFloat())
    println(zeroAmount.toFloat() / arr.size.toFloat())
}
