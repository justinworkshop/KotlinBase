package com.example.kotlinbase.core

/**
 * Copyright (C), 2016-2020
 * FileName: StringUtils
 * Author: zhengwei
 * Date: 2021/2/24 08:42
 * Description:
 */
/**
 * Kt静态方法两种：
 * 1. JvmStatic注解
 * 2. companion伴生对象
 */
class StringUtils {
    companion object {
        fun isEmpty(string: String): Boolean {
            return "" == string
        }
    }
}

fun main() {
    StringUtils.isEmpty("A")
}