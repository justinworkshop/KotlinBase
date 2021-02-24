package com.example.kotlinbase.sample05.s02

/**
 * Copyright (C), 2016-2020
 * FileName: Person
 * Author: zhengwei
 * Date: 2020-07-11 14:27
 * Description:
 */
// 默认public final class
// abstract 详单于open
abstract class Person : Callback {
    abstract fun getLayoutID(): Int
    abstract fun initView()

}