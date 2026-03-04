package me.sungbin.lec04

fun main() {
    val money1 = Money(1_000L)
    val money2 = money1
    val money3 = Money(1_000L)

    if (money1 < money2) {
        println("money1 is less than money2")
    }

    println(money1 === money2)
    println(money1 == money3)

    println(money1 + money2)
}