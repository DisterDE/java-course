package com.kachalov.gu.android.java.lesson10.task2

fun main() {
    val phonebook = Phonebook()

    phonebook.add("Ivanov", 599)
    phonebook.add("Ivanov", 305)
    phonebook.add("Ivanov", 144)
    phonebook.add("Semenov", 577)

    println(phonebook.get("Ivanov"))
    println(phonebook.get("Semenov"))
}