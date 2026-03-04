package me.sungbin.lec04

data class Money(
    private val amount: Long,
) : Comparable<Money> {
    operator fun plus(other: Money): Money {
        return Money(amount + other.amount)
    }

    override fun compareTo(other: Money): Int {
        return amount.compareTo(other.amount)
    }
}