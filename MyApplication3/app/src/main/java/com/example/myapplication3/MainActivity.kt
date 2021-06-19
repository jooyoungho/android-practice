package com.example.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var one: One
        if (1>2) {
            one = One()
        }
        one.print()
    }
    class One {
        fun print() {
            Log.d("null_safety", "can you call me?")
        }
    }
}