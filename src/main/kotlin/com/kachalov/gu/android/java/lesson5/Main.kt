package com.kachalov.gu.android.java.lesson5

fun main() {
    val persons = arrayOf(
        Person("person1", "workPosition1", "email1", "phone1", 100500, 20),
        Person("person2", "workPosition2", "email2", "phone2", 100501, 21),
        Person("person3", "workPosition3", "email3", "phone3", 100502, 18),
        Person("person4", "workPosition4", "email4", "phone4", 100503, 79),
        Person("person5", "workPosition5", "email5", "phone5", 100504, 41),
    )

    persons.printAllOlderThan40()
}

private fun Array<Person>.printAllOlderThan40() {
    filter { it.age >= 40 }
        .forEach(::println)
}