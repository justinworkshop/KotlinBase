package com.example.kotlinbase.sample01

/**
 * Copyright (C), 2016-2020
 * FileName: InDemo
 * Author: zhengwei
 * Date: 2020-07-11 11:20
 * Description: 区间
 */
fun main() {
    // 从1到9
    for (i in 1..9) {
        println(i)
    }

    // 从9到1
    for (i in 9 downTo 1) {
        println(i)
    }

    val value = 88
    if (value in 1..100) {
        println("在1 .. 100 之间")
    }

    for (i in 1..20 step 2) {
        println(i)
    }

    // 排除最后的元素
    for (i in 1 until 5) {
        println(i)
    }
}