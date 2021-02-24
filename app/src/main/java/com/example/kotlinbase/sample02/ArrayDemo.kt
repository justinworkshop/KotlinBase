package com.example.kotlinbase.sample02

/**
 * Copyright (C), 2016-2020
 * FileName: ArrayDemo
 * Author: zhengwei
 * Date: 2020-07-11 11:30
 * Description:
 */
fun main() {
    // 方式1
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    // 方式2
    val numbers2 = Array(5) { value: Int -> (value + 1000) }
    for (value in numbers2) {
        println(value)
    }
}