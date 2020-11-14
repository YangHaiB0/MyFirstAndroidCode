package com.yanghaibooo.firstcode.six

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yanghaibooo.firstcode.R
import kotlinx.android.synthetic.main.activity_main_six.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_six)

        openBroadcast.setOnClickListener {
            Intent(this, com.yanghaibooo.firstcode.six.broadcast.MainActivity::class.java).also(this::startActivity)
        }

        openPractice.setOnClickListener {
            Intent(this, com.yanghaibooo.firstcode.six.practice.LoginActivity::class.java).also(this::startActivity)
        }
    }
}