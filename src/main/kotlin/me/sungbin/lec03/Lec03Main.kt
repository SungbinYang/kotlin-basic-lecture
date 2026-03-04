package me.sungbin.lec03

fun main() {
    var number1: Int? = 3
    var number2: Long = number1?.toLong() ?: 0L
    var str: String = number1.toString()

    val person = Person("양성빈", 100)
    val name = person.name
    val age = person.age
    println("내 이름은 ${name}이고, 나이는 $age 입니다.")

    val log = """
        fsdfdsfsd
        fdsfdsfsdfds
        fsdfdsf
    """.trimIndent()
    println(log)

    val abc = "ABC"
    println(abc[0])
}

fun printAgeIfPersonV1(obj: Any) {
    if (obj is Person) {
        var person = obj as Person
        println(person.age)
    }
}

fun printAgeIfPersonV2(obj: Any) {
    if (obj is Person) {
        println(obj.age)
    }
}

fun printAgeIfPersonV3(obj: Any?) {
    if (obj is Person) {
        var person = obj as? Person
        println(person?.age ?: 0)
    }
}

fun printAgeIfPersonV4(obj: Any?) {
    if (obj !is Person) {
        throw IllegalArgumentException("obj must be Person")
    }
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}