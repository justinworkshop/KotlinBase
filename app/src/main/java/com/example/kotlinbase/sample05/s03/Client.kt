package com.example.kotlinbase.sample05.s03

/**
 * Copyright (C), 2016-2020
 * FileName: Client
 * Author: zhengwei
 * Date: 2020-07-11 14:33
 * Description:
 */
fun main() {
    val user = User(11, "aa", 'M')
    // _表示拒收
    val (myID, _, mySex) = user.copy()

    println("myID:$myID, mySex:$mySex")

//    MyEngine().m()
//    MyEngine().m()

    MyEngine.m()
    MyEngine.m()
}