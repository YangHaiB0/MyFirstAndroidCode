package com.yanghaibooo.firstcode.eight

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yanghaibooo.firstcode.R
import kotlinx.android.synthetic.main.activity_eight_main.*

class MainEightActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eight_main)

        setListener()
    }

    private fun setListener() {
        openContactActivity.setOnClickListener {
            startActivity(Intent(this, com.yanghaibooo.firstcode.eight.contacts.MainActivity::class.java))
        }
        openDatabase.setOnClickListener {

        }
        openProvider.setOnClickListener {

        }
        openRuntimePermission.setOnClickListener {
            startActivity(Intent(this, com.yanghaibooo.firstcode.eight.runtime_permission.MainActivity::class.java))
        }
    }
}