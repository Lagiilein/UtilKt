package com.github.lagiilein.utilkt.challenges

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class CountApplesAndOrangesTest {
    @Test
    fun `test count apples and oranges`() {
        Assertions.assertArrayEquals(
            arrayOf(1, 1),
            countApplesAndOranges(7, 11, 5, 15, arrayOf(-2, 2, 1), arrayOf(5, -6))
        )
    }
}
