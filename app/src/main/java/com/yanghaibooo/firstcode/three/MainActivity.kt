package com.yanghaibooo.firstcode.three

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yanghaibooo.firstcode.R
import com.yanghaibooo.firstcode.three.activity.FirstActivity
import kotlinx.android.synthetic.main.activity_main_three.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_three)

        openActivity.setOnClickListener {
            startActivity(Intent(this, FirstActivity::class.java))
        }
    }
}