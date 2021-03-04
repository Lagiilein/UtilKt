package com.github.lagiilein.utilkt.challenges

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class CountHighestValueAmountTest {
    @Test
    fun `test count highest value amount`() {
        Assertions.assertEquals(5, countHighestValueAmount(arrayOf(0, 1, 2, 3, 4, 5, 5, 5, 4, 3, 5, 1, Int.MIN_VALUE, 5)))
    }
}
