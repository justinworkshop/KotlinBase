package com.example.kotlinbase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity(var int: Int) : AppCompatActivity(), View.OnClickListener {

    init {
        println("Init代码块 在类的构造函数调用时执行")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}
