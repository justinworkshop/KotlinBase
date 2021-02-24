package com.example.kotlinbase.sample05.s01

/**
 * Copyright (C), 2016-2020
 * FileName: Person
 * Author: zhengwei
 * Date: 2020-07-11 14:16
 * Description:
 */
open class Person(id: Int) { // 主构造
    // 次构造
    constructor(id: Int, name: String) : this(id) {

    }

    // 次构造
    constructor(id: Int, sex: Char) : this(id) {

    }

    // 次构造
    constructor() : this(12) {

    }


}