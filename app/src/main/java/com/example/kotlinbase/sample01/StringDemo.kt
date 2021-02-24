package com.example.kotlinbase.sample01

/**
 * Copyright (C), 2016-2020
 * FileName: StringDemo
 * Author: zhengwei
 * Date: 2020-07-11 11:07
 * Description: String
 */
fun main() {
    val name = "张三"
    val age = 18
    val sex = 'M'
    val info = "Hello world"
    println("name:$name, age:$age, sex:$sex, info:$info")

    // 换行
    val infoMsg = """
        |AAA
        |BBB
        |CCC
        |DDD
    """.trimMargin()

    val infoMsg2 = """
        ？AAA
        ？BBB
        ？CCC
        ？DDD
    """.trimMargin("？")

    // .trimMargin() 去掉的话就会有空格
    println(infoMsg)

    // 打印$99.999
    val price = """
        ${'$'}99.999
    """.trimIndent()
    println(price)
}