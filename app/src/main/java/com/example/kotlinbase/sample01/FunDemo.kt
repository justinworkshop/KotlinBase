package com.example.kotlinbase.sample01

/**
 * Copyright (C), 2016-2020
 * FileName: FunDemo
 * Author: zhengwei
 * Date: 2020-07-11 11:00
 * Description: 函数，之所以成为函数，是可以写在类的里面，也可以是类的外面。
 * 函数在kotlin是一级公民
 */

// void == :Unit
fun main() {
    println(add(1, 2))
    lenMethod(1, 2, 3, 4, 5)

    // lambda表达式函数
    val addMethod: (Int, Int) -> Int = { n1, n2 -> n1 + n2 }
    var v = addMethod(2, 2)
    println(v)
}

fun add(n1: Int, n2: Int): Int {
    return n1 + n2;
}

// 返回类型推导
fun add1(n1: Int, n2: Int) = n1 + n2

fun lenMethod(vararg value: Int) {
    for (i: Int in value) {
        println(i)
    }
}
