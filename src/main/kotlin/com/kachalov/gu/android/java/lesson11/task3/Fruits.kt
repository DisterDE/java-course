package com.kachalov.gu.android.java.lesson11.task3

sealed class Fruit(val weight: Float)

class Apple : Fruit(1.0f)

class Orange : Fruit(1.5f)