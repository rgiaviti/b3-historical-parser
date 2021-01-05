package com.gh.rgiaviti.b3.histparser

import java.io.File

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val file = "/home/rgiaviti/Desktop/smalltest.txt"
        B3FileParser.parse(File(file))
    }
}