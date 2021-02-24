package com.example.kotlinbase.core

/**
 * Copyright (C), 2016-2020
 * FileName: Singleton
 * Author: zhengwei
 * Date: 2021/2/24 08:47
 * Description:
 */

//单例模式的推荐用法：用companion
class Single private constructor() {
    companion object {
        fun get(): Single {
            return Holder.instance
        }
    }

    private object Holder {
        val instance = Single()
    }
}

fun main() {
    val get = Single.get()
}