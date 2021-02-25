package com.example.kotlinbase.player

/**
 * Copyright (C), 2016-2020
 * FileName: VIPPlayer
 * Author: zhengwei
 * Date: 2021/2/25 08:55
 * Description:
 */

const val TITLE = "播放器标题"
const val MSG = "播放器消息"

class VIPPlayer(var title: String?, var msg: String?) : PlayerView {
    init {
        println("主构造方法")
        title = title ?: TITLE
        msg = msg ?: MSG
    }

    constructor() : this(TITLE, MSG) {
        println("无参构造方法")
    }

    constructor(msg: String?) : this(TITLE, msg) {
        println("一个参数的构造方法")
    }

    override fun showView() {
        println("VIP view")
    }

    override fun getPlayButton() {
        println("显示VIP Button")
    }
}