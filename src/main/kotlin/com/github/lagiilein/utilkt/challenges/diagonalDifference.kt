package com.github.lagiilein.utilkt.challenges

/**
 * https://www.hackerrank.com/challenges/diagonal-difference
 */
fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var primaryDiagonalSum = 0
    var secondaryDiagonalSum = 0

    // >> 11 5 -12 << 4 5 10
    // >> 4 << 19


    arr.forEachIndexed { i, ints ->
        primaryDiagonalSum += ints[i]
        secondaryDiagonalSum += ints[ints.size - 1 - i]
    }

    return if (primaryDiagonalSum - secondaryDiagonalSum < 0)
        (primaryDiagonalSum - secondaryDiagonalSum) * -1
    else
        primaryDiagonalSum - secondaryDiagonalSum
}
