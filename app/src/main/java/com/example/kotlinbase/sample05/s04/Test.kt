package com.example.kotlinbase.sample05.s04

/**
 * Copyright (C), 2016-2020
 * FileName: Test
 * Author: zhengwei
 * Date: 2020-07-11 14:55
 * Description:
 */
class Test {
    val i = "AA"

    // 嵌套类
    class Sub {
        fun show() {
            println()
        }
    }

    // 内部类，可以访问外部类
    inner class Sub2 {
        fun show() {
            println(i)
        }
    }
}

