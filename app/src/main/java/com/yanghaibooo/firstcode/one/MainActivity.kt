package com.yanghaibooo.firstcode.one

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.yanghaibooo.firstcode.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_one)
        Log.d("data", "onCreate execute")
    }
}