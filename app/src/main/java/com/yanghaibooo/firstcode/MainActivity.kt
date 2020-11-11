package com.yanghaibooo.firstcode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }

    private fun setListener() {
        openFirstBtn.setOnClickListener {
            Intent(this, FirstActivity::class.java).also(this::startActivity)
        }
        openRuntimePermissionBtn.setOnClickListener {
            Intent(this, RuntimePermissionActivity::class.java).also(this::startActivity)
        }
        openContactBtn.setOnClickListener {
            Intent(this, ContactActivity::class.java).also(this::startActivity)
        }
    }
}