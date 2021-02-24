package com.example.kotlinbase.sample05.s04

/**
 * Copyright (C), 2016-2020
 * FileName: NetManager2
 * Author: zhengwei
 * Date: 2020-07-11 14:45
 * Description:
 */
class NetManager2 {
    companion object {
        private var instance: NetManager2? = null
        fun getInstance(): NetManager2? {
            if (instance == null) {
                instance = NetManager2()
            }

//            return instance!!
            return instance
        }
    }

    fun show(name: String) {
        println("Show: $name")
    }
}

fun main() {
    val netManager = NetManager2.getInstance()
    netManager?.show("AAA")
}