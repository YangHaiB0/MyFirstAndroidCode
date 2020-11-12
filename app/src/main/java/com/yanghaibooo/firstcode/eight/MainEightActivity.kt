package com.yanghaibooo.firstcode.eight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yanghaibooo.firstcode.R
import kotlinx.android.synthetic.main.activity_four_main.*
import kotlinx.android.synthetic.main.activity_main_eight.*

class MainEightActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_eight)

        setListener()
    }

    private fun setListener() {
        openContactActivity.setOnClickListener {
            startActivity(Intent(this, ContactActivity::class.java))
        }
        openDatabase.setOnClickListener {

        }
        openProvider.setOnClickListener {

        }
        openRuntimePermission.setOnClickListener {
            startActivity(Intent(this, RuntimePermissionActivity::class.java))
        }
    }
}