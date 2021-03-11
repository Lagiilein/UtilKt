package com.github.lagiilein.utilkt.challenges

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class KangarooTest {
    @Test
    fun `test calculateJump`() {
        Assertions.assertEquals(4, calculateJump(0, 3, 4, 2))
        Assertions.assertEquals(-1, calculateJump(0, 2, 5, 3))
    }
}
