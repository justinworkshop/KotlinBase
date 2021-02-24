package com.example.kotlinbase.sample05.s02

/**
 * Copyright (C), 2016-2020
 * FileName: Student
 * Author: zhengwei
 * Date: 2020-07-11 14:29
 * Description:
 */
class Student : Person() {
    override fun initView() {
    }

    override fun callbackMethod(): Boolean = false

    override fun getLayoutID(): Int = 99

}