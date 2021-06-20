package com.example.kotlinbase.sample03

/**
 * Copyright (C), 2016-2020
 * FileName: IfDemo
 * Author: zhengwei
 * Date: 2020-07-11 11:40
 * Description:
 */
fun main() {
    val number1: Int = 99
    val number2: Int = 88

    val maxValue = if (number1 > number2) number1 else number2
    println(maxValue)

    val max: Int = if (number1 > number2) {
        println()

        // 需要返回
        number1
    } else {
        println()

        // 需要返回
        number2
    }
    println(max)

    // when对应Java的switch
    val n = 5
    when (n) {
        1 -> println("1")
        2 -> println("2")
        3 -> println("3")
        4 -> println("4")
        5 -> println("5")
        else -> println("else")
    }

    val bigN = 301
    when (bigN) {
        in 1..100 -> println("1..100")
        in 101..200 -> println("201..200")
        in 201..300 -> println("201..300")
        else -> println()
    }
}