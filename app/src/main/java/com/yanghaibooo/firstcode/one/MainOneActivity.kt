package com.yanghaibooo.firstcode.one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.yanghaibooo.firstcode.R

class MainOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_main)
        Log.d("data","onCreate execute")
    }
}