package com.yanghaibooo.firstcode.four

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yanghaibooo.firstcode.R
import kotlinx.android.synthetic.main.activity_main_four.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_four)

        setListener()
    }

    private fun setListener() {
        openListView.setOnClickListener {
            startActivity(Intent(this, com.yanghaibooo.firstcode.four.list_view.MainActivity::class.java))
        }
        openRecycleView.setOnClickListener {
            startActivity(Intent(this, com.yanghaibooo.firstcode.four.recycle_view.MainActivity::class.java))
        }
        openUiBestPractice.setOnClickListener {
            startActivity(Intent(this, com.yanghaibooo.firstcode.four.ui_best_practice.MainActivity::class.java))
        }
    }
}