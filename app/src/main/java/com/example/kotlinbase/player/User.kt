package com.example.kotlinbase.player

/**
 * Copyright (C), 2016-2020
 * FileName: User
 * Author: zhengwei
 * Date: 2021/2/25 08:42
 * Description:
 */
data class User(
    var id: Int,
    var name: String,
    var playerType: PlayerViewType = PlayerViewType.BLUE
) {
}