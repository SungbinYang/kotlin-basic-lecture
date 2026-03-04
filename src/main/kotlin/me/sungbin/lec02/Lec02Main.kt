package me.sungbin.lec02

fun main() {
    var str: String? = "ABC"
    println(str?.length ?: 0)

    val person = Person("양성빈")
    println(person.name.length)
}

class JavaWrapper {
    fun getLength(person: Person): Int {
        return person.name?.length ?: 0
    }
}

fun startsWithA4(str: String?): Boolean {
    return str!!.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("str must not be null")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWithA(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("str must not be null")
    }

    return str.startsWith("A")
}