package com.example.kotlinbase.player

/**
 * Copyright (C), 2016-2020
 * FileName: PlayerUI
 * Author: zhengwei
 * Date: 2021/2/25 08:47
 * Description:
 */
class PlayerUI private constructor() {
    companion object {
        fun get(): PlayerUI {
            return Holder.instance
        }
    }

    private object Holder {
        val instance = PlayerUI()
    }

    fun showPlayer(user: User) {
        MediaPlayerView(getPlayerView(user.playerType)).showView()
    }
}