package com.example.kotlinbase.player

/**
 * Copyright (C), 2016-2020
 * FileName: PlyerView
 * Author: zhengwei
 * Date: 2021/2/25 08:44
 * Description:
 */
interface PlayerView {
    fun showView()
    fun getPlayButton()
}

class GreenPlayerView : PlayerView {
    override fun showView() {
        println("显示绿色播放器")
    }

    override fun getPlayButton() {
        println("显示绿色Button")
    }

}

class MediaPlayerView(playerView: PlayerView) : PlayerView by playerView