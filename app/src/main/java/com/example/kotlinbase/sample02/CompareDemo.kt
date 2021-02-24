package com.example.kotlinbase.sample02

/**
 * Copyright (C), 2016-2020
 * FileName: CompareDemo
 * Author: zhengwei
 * Date: 2020-07-11 11:27
 * Description:
 */
fun main() {
    // 比较值本身
    val name1 = "aaa"
    val name2 = "aaa"
    println(name1.equals(name2))
    println(name1 == name2) // ==  等价与equals

    // 比较对象地址
    val test1: Int = 100
    val test2: Int = 100
    println(test1 === test2) // false
}