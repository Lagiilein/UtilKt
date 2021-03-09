package com.github.lagiilein.utilkt.number

fun Int.isInRangeInclusive(a: Int, b: Int): Boolean {
    return if (a > b) {
        this in b..a
    } else if (b > a) {
        this in a..b
    } else {
        this == a && this == b
    }
}

fun Short.isInRangeInclusive(a: Short, b: Short): Boolean {
    return this.toInt().isInRangeInclusive(a.toInt(), b.toInt())
}

fun Float.isInRangeInclusive(a: Float, b: Float): Boolean {
    return if (a > b) {
        this in b..a
    } else if (b > a) {
        this in a..b
    } else {
        this == a && this == b
    }
}

fun Double.isInRangeInclusive(a: Double, b: Double): Boolean {
    return if (a > b) {
        this in b..a
    } else if (b > a) {
        this in a..b
    } else {
        this == a && this == b
    }
}
