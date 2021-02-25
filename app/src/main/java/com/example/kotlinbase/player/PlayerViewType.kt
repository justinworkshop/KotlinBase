package com.example.kotlinbase.player

/**
 * Copyright (C), 2016-2020
 * FileName: PlayerViewType
 * Author: zhengwei
 * Date: 2021/2/25 08:50
 * Description:
 */
sealed class PlayerViewType {
    object GREEN : PlayerViewType()
    object BLUE : PlayerViewType()
    class VIP(val title: String? = null, val msg: String? = null) : PlayerViewType()
}

fun getPlayerView(type: PlayerViewType) = when (type) {
    PlayerViewType.GREEN -> GreenPlayerView()
    PlayerViewType.BLUE -> BluePlayerView()
    // is 关键字
    is PlayerViewType.VIP -> VIPPlayer(type.title, type.msg)
}