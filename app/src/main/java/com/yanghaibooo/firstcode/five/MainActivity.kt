package com.yanghaibooo.firstcode.five

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yanghaibooo.firstcode.R
import kotlinx.android.synthetic.main.activity_main_five.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_five)

        openFragment?.setOnClickListener {
            startActivity(Intent(this, com.yanghaibooo.firstcode.five.fragment.MainActivity::class.java))
        }

        openPractice.setOnClickListener {
            startActivity(Intent(this, com.yanghaibooo.firstcode.five.fragment_practice.MainActivity::class.java))
        }
    }
}