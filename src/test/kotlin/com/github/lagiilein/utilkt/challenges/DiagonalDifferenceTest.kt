package com.github.lagiilein.utilkt.challenges

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class DiagonalDifferenceTest {
    @Test
    fun `test diagonal difference`() {
        Assertions.assertEquals(2, diagonalDifference(arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(9, 8, 9))))
        Assertions.assertEquals(15, diagonalDifference(arrayOf(arrayOf(11, 2, 4), arrayOf(4, 5, 6), arrayOf(10, 8, -12))))
    }
}
