package com.example.kotlinbase.core

/**
 * Copyright (C), 2016-2020
 * FileName: By
 * Author: zhengwei
 * Date: 2021/2/25 08:24
 * Description:
 */
interface Animal {
    fun bark()
}

class Dog : Animal {
    override fun bark() {
        println("Dog wang! wang!")
    }
}

/**
 * Kt动态代理转为静态代理，效力高于Java
 * Java的动态代理本质上是用反射调用
 */
class Zoo(animal: Animal) : Animal by animal {
    override fun bark() {
        println("Ask")
    }
}

fun main() {
    Zoo(Dog()).bark()
}