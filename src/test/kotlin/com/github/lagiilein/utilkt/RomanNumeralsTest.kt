package com.github.lagiilein.utilkt

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class RomanNumeralsTest {
    @Test
    fun `test Int to Roman Numeral conversion`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) { RomanNumerals.convertToRoman(0) }
        Assertions.assertThrows(IllegalArgumentException::class.java) { RomanNumerals.convertToRoman(4000) }
        Assertions.assertEquals("I", RomanNumerals.convertToRoman(1))
        Assertions.assertEquals("IV", RomanNumerals.convertToRoman(4))
        Assertions.assertEquals("DCCLXXXVI", RomanNumerals.convertToRoman(786))
        Assertions.assertEquals("DCCXCIX", RomanNumerals.convertToRoman(799))
        Assertions.assertEquals("MMMCMXCIX", RomanNumerals.convertToRoman(3999))
    }
}
