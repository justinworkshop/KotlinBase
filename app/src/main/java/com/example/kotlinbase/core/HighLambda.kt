package com.example.kotlinbase.core

/**
 * Copyright (C), 2016-2020
 * FileName: HighLambda
 * Author: zhengwei
 * Date: 2021/2/24 08:24
 * Description:
 */
//高阶函数：函数的参数是函数， 这里的韩式就是Lambda
fun onlyIf(isDebug: Boolean, block: () -> Unit) {
    if (isDebug) {
        block()
    }
}

fun main(args: Array<String>) {
    //声明runnable对象
    val runnable = Runnable {
        println("Runnable::run")
    }

    //声明参数为（）的函数对象
    val function: () -> Unit

    //run方法赋值给function
    function = runnable::run

    //{}为lambda类型的参数，写到参数列表外的条件是lambda是最后一个参数
    onlyIf(true) {
        println("打印日志")
    }

    onlyIf(true) {
        ->
        println("Hello")
    }

    onlyIf(true, function)
}