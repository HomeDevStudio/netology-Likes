package ru.netology

fun main() {
    val likes = 61
    val resultString = if ( likes % 10 == 1 ) "Понравилось $likes человеку" else "Понравилось $likes людям"
    println(resultString)
}