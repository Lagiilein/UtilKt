package com.github.lagiilein.utilkt

object ListUtil {
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
     * @sample compareIntListContentBasedOnScoresExample1
     */
    fun compareIntListContentBasedOnScores(a: List<Int>, b: List<Int>): List<Int> {
        var scoreA = 0;
        var scoreB = 0;

        if (a.size != b.size)
            throw IllegalArgumentException("arguments must be equal size")

        a.forEachIndexed { i, _ ->
            if (a[i] > b[i]) {
                scoreA++
            } else if (b[i] > a[i]) {
                scoreB++
            }
        }

        return listOf(scoreA, scoreB)
    }

    /**
     * private function, which shows the usage of [compareIntListContentBasedOnScores]
     */
    private fun compareIntListContentBasedOnScoresExample1() {
        compareIntListContentBasedOnScores(listOf(1, 2, 3, 4), listOf(3, 2, 1, 0)) // [2, 1]
    }
}
