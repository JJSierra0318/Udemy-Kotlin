package io

import java.io.File

fun main(args: Array<String>) {
    val ipToCount = mutableMapOf<String, Int>()
    File("src/60.ips.txt").forEachLine {
        val previous = ipToCount.getOrDefault(it, 0)
        ipToCount[it] = previous + 1
    }

    val (maxIp, maxCount) = ipToCount.entries.maxBy { it.value }

    /*
    var maxIp = ipToCount.keys.first()
    var maxCount = 0
    for ((ip, count) in ipToCount.entries) {
        if (count > maxCount) {
            maxCount = count
            maxIp = ip
        }
    }
    */

    println("Most frequent IP address is $maxIp, which occurred $maxCount times.")
}