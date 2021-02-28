package com.github.lagiilein.utilkt

/**
 * Compares two integer lists and returns the scores of the lists.
 * It goes through every index and compares it to the integer of the other list at the index.
 *
 * A list gets a score,
 * when the own value at an index is greater than the value of the other list at same index.
 * If the values are even, neither of the arrays gets the point.
 *
 * This utility origins from an hackerrank.com practice:
 * [https://www.hackerrank.com/challenges/compare-the-triplets](https://www.hackerrank.com/challenges/compare-the-triplets)
 *
 * @return An Int Array with [a, b] where a and b are the scores of the corresponding list.
 * @throws IllegalArgumentException arguments must be equal size
 *
 * @see ListUtil.compareIntListContentBasedOnScores
 */
fun List<Int>.compareContentBasedOnScores(b: List<Int>): List<Int> =
    ListUtil.compareIntListContentBasedOnScores(this, b)
