package com.example.kotlinbase.core

/**
 * Copyright (C), 2016-2020
 * FileName: Sealed
 * Author: zhengwei
 * Date: 2021/2/25 08:32
 * Description:
 */
/**
 * 密闭类，也就是超级枚举
 * 可以扩展其子类
 */
sealed class SuperCommand {
    object A : SuperCommand()
    object B : SuperCommand()
    object C : SuperCommand()
    object D : SuperCommand()

    // 子类
    class E(var id: Int) : SuperCommand()
}

fun exec(superCommand: SuperCommand) = when (superCommand) {
    SuperCommand.A -> {
        println("A")
    }
    SuperCommand.B -> {
        println("B")
    }
    SuperCommand.C -> {
        println("C")
    }
    SuperCommand.D -> {
        println("D")
    }
    //
    is SuperCommand.E -> {
        println("E")
    }
}

fun main() {
    exec(SuperCommand.C)
    exec(SuperCommand.E(1))
}