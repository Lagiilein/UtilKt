package com.github.lagiilein.utilkt.challenges

import com.github.lagiilein.utilkt.number.isInRangeInclusive

/**
 * [https://www.hackerrank.com/challenges/apple-and-orange]
 */
fun countApplesAndOranges(
    startHouse: Int,
    endHouse: Int,
    appleTree: Int,
    orangeTree: Int,
    apples: Array<Int>,
    oranges: Array<Int>
): Array<Int> {
    var applesOnHouse = 0
    var orangesOnHouse = 0

    apples.forEach {
        if ((appleTree + it).isInRangeInclusive(startHouse, endHouse)) {
            applesOnHouse++
        }
    }

    oranges.forEach {
        if ((orangeTree + it).isInRangeInclusive(startHouse, endHouse)) {
            orangesOnHouse++
        }
    }

    return arrayOf(applesOnHouse, orangesOnHouse)
}
