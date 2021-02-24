package com.example.kotlinbase.sample04

/**
 * Copyright (C), 2016-2020
 * FileName: ForDemo
 * Author: zhengwei
 * Date: 2020-07-11 14:06
 * Description:
 */
fun main() {
    // 自定义标签
    tag@ for (i in 1..20) {
        for (j in i..20) {
            println("i:$i, j:$j")

            if (i == 5) {
                break@tag
            }
        }
    }

    // 循环
    var items = listOf("a", "b", "c")
    for (item in items) {
        println(item)
    }

    items.forEach { aa ->
        println(aa)
    }

    for (index in items.indices) {
        println("下标:$index, 对应的值:${items[index]}")
    }
}

// 自带的标签
class Justin {
    val i = "AA";

    fun show() {
        println(i)
        println(this.i)
        println(this@Justin.i)
    }
}