package com.github.lagiilein.utilkt.challenges

/**
 * [https://www.hackerrank.com/challenges/grading]
 */
fun gradingStudents(grades: Array<Int>): Array<Int> {
    return grades.map {
        if (it < 38)
            return@map it

        val nextMultipleOfFive = ((it / 5) + 1) * 5

        if (nextMultipleOfFive - it < 3)
            return@map nextMultipleOfFive
        else
            return@map it
    }.toTypedArray()
}
