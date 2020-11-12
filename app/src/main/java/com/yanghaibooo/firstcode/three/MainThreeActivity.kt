package com.yanghaibooo.firstcode.three

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yanghaibooo.firstcode.R
import com.yanghaibooo.firstcode.three.activity.FirstActivity
import kotlinx.android.synthetic.main.activity_three_main.*

class MainThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_main)

        openActivity.setOnClickListener {
            startActivity(Intent(this, FirstActivity::class.java))
        }

        openActivityLifeCycle.setOnClickListener {
            // todo
        }
    }
}