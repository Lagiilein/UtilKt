package com.github.lagiilein.utilkt.challenges

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class GradingStudentsTest {
    @Test
    fun `test grading students`() {
        Assertions.assertArrayEquals(arrayOf(75, 67, 40, 33), gradingStudents(arrayOf(73, 67, 38, 33)))
    }
}
