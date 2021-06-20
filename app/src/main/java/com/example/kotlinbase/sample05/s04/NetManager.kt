package com.example.kotlinbase.sample05.s04

/**
 * Copyright (C), 2016-2020
 * FileName: NetManager
 * Author: zhengwei
 * Date: 2020-07-11 14:41
 * Description:
 */
class NetManager {
    // object是只有一个实例
    object Holder {
        val instance = NetManager()
    }

    // kotlin看不到static，可用派生操作来代替
    companion object {
        // 全部相当于Java的static
        fun getInstance(): NetManager = Holder.instance
    }

    fun show(name: String) {
        println("Show: $name")
    }
}

fun main() {
    val net = NetManager.getInstance()
    net.show("kt singleton")
}