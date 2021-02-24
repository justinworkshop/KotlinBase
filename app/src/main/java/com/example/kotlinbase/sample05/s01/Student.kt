package com.example.kotlinbase.sample05.s01

/**
 * Copyright (C), 2016-2020
 * FileName: Student
 * Author: zhengwei
 * Date: 2020-07-11 14:21
 * Description:
 */
class Student(id: Int) : Person(id) {
    // 主构造

    // Kotlin中没有默认值，所以必须有默认值，否则可以用懒加载。
    // 懒加载没有赋值，不能使用，否则报错
    lateinit var name: String // 懒加载
    var age: Int = 0

}