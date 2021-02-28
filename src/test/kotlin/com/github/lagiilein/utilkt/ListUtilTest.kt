package com.github.lagiilein.utilkt

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class ListUtilTest {
    @Test
    fun `test compare int list content based on scores`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) { ListUtil.compareIntListContentBasedOnScores(listOf(0), listOf()) }

        Assertions.assertEquals(listOf(2, 1), ListUtil.compareIntListContentBasedOnScores(listOf(1, 2, 3, 4), listOf(3, 2, 1, 0)))
        Assertions.assertEquals(listOf(2, 0), listOf(1, 2, 3, 4).compareContentBasedOnScores(listOf(1, 2, 1, 0)))
    }
}
