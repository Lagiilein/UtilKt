package com.github.lagiilein.utilkt.challenges

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class Convert12HourTimeToMilitaryTest {
    @Test
    fun `test convert 12 hour to military time`() {
        Assertions.assertEquals("12:44:04", convert12HourTimeToMilitary("12:44:04PM"))
        Assertions.assertEquals("00:59:59", convert12HourTimeToMilitary("00:59:59AM"))
        Assertions.assertEquals("05:59:59", convert12HourTimeToMilitary("05:59:59AM"))
    }

}
