package ru.netology

fun main() {
    // val likes = 61   // Понравилось 61 человеку
    // val likes = 11   // Понравилось 11 людям
    // val likes = 21   // Понравилось 21 человеку
    // val likes = 111  // Понравилось 111 человеку
    // val likes = 3    // Понравилось 3 людям
    // val likes = 15   // Понравилось 15 людям
    // val likes = 38   // Понравилось 38 людям
    val likes = 377     // Понравилось 377 людям

    val resultString = if ( likes % 10 == 1 && likes % 100 != 11) "Понравилось $likes человеку" else "Понравилось $likes людям"
    println(resultString)
}