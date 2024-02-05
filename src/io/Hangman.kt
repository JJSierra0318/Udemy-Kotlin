package io

import java.util.*

fun main(args: Array<String>) {
    print("Enter the word to guess: ")
    val word = readLine()
    if (word == null) {
        println("No word given, game ended.")
        return
    }

    for (i in 1..100) {
        println()
    }

    val letters = word.lowercase().toCharArray().toHashSet() //Rid of duplicates
    val correctGuesses = mutableSetOf<Char>()
    var fails = 0

    while (letters != correctGuesses) {

        printExploredWord(word, correctGuesses)
        println("\n#Wrong guesses: $fails\n")

        print("Guess letter: ")
        val input = readLine()

        if (input == null) {
            continue
        } else if (input.length != 1) {
            println("Please enter one letter")
            continue
        }

        if (word.lowercase().contains(input.lowercase())) {
            correctGuesses.add(input.lowercase()[0])
        } else {
            fails++
        }
    }

    printExploredWord(word, correctGuesses)
    println("#Wrong guesses: $fails\n\nWell done\n")
}

fun printExploredWord(word: String, correctGuesses: Set<Char>) {
    for (character in word.lowercase()) {
        if (correctGuesses.contains(character)) {
            print("$character ")
        } else {
            print("_ ")
        }
    }
}