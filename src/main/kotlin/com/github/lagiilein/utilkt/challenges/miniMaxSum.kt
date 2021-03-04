package com.github.lagiilein.utilkt.challenges

/**
 * [https://www.hackerrank.com/challenges/mini-max-sum]
 */
fun miniMaxSum(arr: Array<Int>) {
    var min = Long.MAX_VALUE
    var max = Long.MIN_VALUE

    arr.forEachIndexed { i, _ ->
        var curMinSum = 0L
        var curMaxSum = 0L

        arr.forEachIndexed { j, it ->
            if (i != j) {
                curMinSum += it
                curMaxSum += it
            }
        }

        if (curMinSum < min)
            min = curMinSum

        if (curMaxSum > max)
            max = curMaxSum
    }

    println("$min $max")
}
