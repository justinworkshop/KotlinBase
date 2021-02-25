package com.example.kotlinbase.player

/**
 * Copyright (C), 2016-2020
 * FileName: Main
 * Author: zhengwei
 * Date: 2021/2/25 08:46
 * Description:
 */
fun main() {
    val user = User(1, "name")
    PlayerUI.get().showPlayer(user)
}