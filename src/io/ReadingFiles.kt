package io

import java.io.File

fun main(args: Array<String>) {
    File("src/inputfile.txt").forEachLine {
        println(it)
    }
}