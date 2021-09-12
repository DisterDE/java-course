package com.kachalov.gu.android.java.lesson10.task2

class Phonebook {
    private val contacts = HashMap<String, MutableSet<Contact>>()

    fun add(surname: String, phoneNumber: Int) {
        val contact = Contact(surname, phoneNumber)
        if (!contacts[surname].isNullOrEmpty()) {
            contacts[surname]!! += contact
        } else {
            contacts[surname] = mutableSetOf(contact)
        }
    }

    fun get(surname: String): Set<Contact> {
        if (surname !in contacts) {
            throw IllegalArgumentException("Contact is not found")
        }
        return contacts[surname]!!
    }
}