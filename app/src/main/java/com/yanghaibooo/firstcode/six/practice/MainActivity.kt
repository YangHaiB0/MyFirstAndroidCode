package com.yanghaibooo.firstcode.six.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.yanghaibooo.firstcode.R
import kotlinx.android.synthetic.main.activity_six_practice_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_practice_main)

        forceOffline.setOnClickListener {
            val intent = Intent("com.yanghaibooo.firstcode.six.practice.FORCE_OFFLINE")
            intent.setPackage(packageName)
            sendBroadcast(intent)
            Toast.makeText(this,"Send FORCE_OFFLINE Broadcast",Toast.LENGTH_SHORT).show()
        }
    }
}