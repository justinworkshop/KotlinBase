package com.example.kotlinbase.player

/**
 * Copyright (C), 2016-2020
 * FileName: BluePlayerView
 * Author: zhengwei
 * Date: 2021/2/25 08:52
 * Description:
 */
class BluePlayerView : PlayerView {
    override fun showView() {
        println("显示蓝色播放器")
    }

    override fun getPlayButton() {
        println("显示蓝色Button")
    }
}