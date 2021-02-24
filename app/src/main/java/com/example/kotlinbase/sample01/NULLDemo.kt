package com.example.kotlinbase.sample01

/**
 * Copyright (C), 2016-2020
 * FileName: NULLDemo
 * Author: zhengwei
 * Date: 2020-07-11 11:14
 * Description: NULL检查机制
 */
fun main() {
    var info: String? = null
    println(info?.length) // info为null就不执行
    println(info!!.length) // info自己保证不为null，强制执行

    if (info != null) { // java写法
        println(info.length)
    }
}

// :Int? 允许返回null
fun test():Int?{
    return null
}