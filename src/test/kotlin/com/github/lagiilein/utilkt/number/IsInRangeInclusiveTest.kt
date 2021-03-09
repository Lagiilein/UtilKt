package com.github.lagiilein.utilkt.number

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class IsInRangeInclusiveTest {
    @Test
    fun `test is in range inclusive short`() {
        Assertions.assertFalse((50.toShort()).isInRangeInclusive(Short.MIN_VALUE, 49.toShort()))
        Assertions.assertTrue((2.toShort()).isInRangeInclusive(Short.MAX_VALUE, Short.MIN_VALUE))
    }

    @Test
    fun `test is in range inclusive integer`() {
        Assertions.assertFalse(50.isInRangeInclusive(Int.MIN_VALUE, 49))
        Assertions.assertTrue(2.isInRangeInclusive(Int.MAX_VALUE, Int.MIN_VALUE))
    }

    @Test
    fun `test is in range inclusive double`() {
        Assertions.assertFalse(50.toDouble().isInRangeInclusive(Double.MIN_VALUE, 49.99))
        Assertions.assertTrue(50.toDouble().isInRangeInclusive(Double.MIN_VALUE, 50.00))
        Assertions.assertTrue(50.toDouble().isInRangeInclusive(50.00, 50.00))
        Assertions.assertTrue(2.00.isInRangeInclusive(Double.MAX_VALUE, Double.MIN_VALUE))
    }

    @Test
    fun `test is in range inclusive float`() {
        Assertions.assertFalse(50.toFloat().isInRangeInclusive(Float.MIN_VALUE, 2.7182818284f))
        Assertions.assertTrue(2.7182818284f.isInRangeInclusive(Float.MAX_VALUE, Float.MIN_VALUE))
    }
}
