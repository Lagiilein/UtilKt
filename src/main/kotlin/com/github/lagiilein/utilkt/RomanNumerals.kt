package com.github.lagiilein.utilkt

object RomanNumerals {
    class RomanNumeral internal constructor(val intValue: Int, val char: Char)

    val orderedRomanNumbers: List<RomanNumeral> = listOf(
        RomanNumeral(1000, 'M'),
        RomanNumeral(500, 'D'),
        RomanNumeral(100, 'C'),
        RomanNumeral(50, 'L'),
        RomanNumeral(10, 'X'),
        RomanNumeral(5, 'V'),
        RomanNumeral(1, 'I'),
    )

    /**
     * function converts integer to roman numerals.
     *
     * It only supports numbers from 1 to 3,999.
     */
    @JvmStatic
    fun convertToRoman(int: Int): String {
        if (int > 3999)
            throw IllegalArgumentException("argument 'int' is greater than 3,999. ")

        if (int < 1)
            throw IllegalArgumentException("argument 'int' is smaller than 1. ")

        var temp = int
        val result = StringBuilder()

        while (temp > 0) {
            var found = false
            orderedRomanNumbers.forEachIndexed { i, it ->
                if (found) return@forEachIndexed

                if (i > 0 && temp == orderedRomanNumbers[i - 1].intValue - it.intValue) {
                    result.append("${it.char}${orderedRomanNumbers[i - 1].char}")
                    temp = temp.minus(orderedRomanNumbers[i - 1].intValue - it.intValue)
                    found = true

                    return@forEachIndexed
                }

                if (
                    i > 0 &&
                    i + 1 < orderedRomanNumbers.size &&
                    temp >= orderedRomanNumbers[i - 1].intValue - orderedRomanNumbers[i + 1].intValue
                ) {
                    result.append("${orderedRomanNumbers[i + 1].char}${orderedRomanNumbers[i - 1].char}")
                    temp = temp.minus(orderedRomanNumbers[i - 1].intValue - orderedRomanNumbers[i + 1].intValue)
                    found = true

                    return@forEachIndexed
                }

                if (temp >= it.intValue) {
                    result.append(it.char)
                    temp = temp.minus(it.intValue)
                    found = true

                    return@forEachIndexed
                }
            }
        }

        return result.toString()
    }
}
