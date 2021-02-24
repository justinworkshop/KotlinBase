package com.example.kotlinbase.core

/**
 * Copyright (C), 2016-2020
 * FileName: GaoJie
 * Author: zhengwei
 * Date: 2020-07-13 11:54
 * Description:
 */
val name: String = "Justin"
val age: Int = 0

fun common() {
    println("I am method")
}

fun main() {
    common().myRun {
        println("AAA")
        true
    }
}

fun <T, R> T.myRun(m: () -> R): R = m()