package com.yanghaibooo.firstcode

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_index.*

class IndexActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)
        setListener()
    }

    private fun setListener() {
        oneChapter.setOnClickListener {
            Intent(this, com.yanghaibooo.firstcode.one.MainActivity::class.java).also(this::startActivity)
        }
        twoChapter.setOnClickListener {
            Intent(this, com.yanghaibooo.firstcode.two.MainActivity::class.java).also(this::startActivity)
        }
        threeChapter.setOnClickListener {
            Intent(this, com.yanghaibooo.firstcode.three.MainActivity::class.java).also(this::startActivity)
        }
        fourChapter.setOnClickListener {
            Intent(this, com.yanghaibooo.firstcode.four.MainActivity::class.java).also(this::startActivity)
        }
        fiveChapter.setOnClickListener {
            Intent(this, com.yanghaibooo.firstcode.five.MainActivity::class.java).also(this::startActivity)
        }
        sixChapter.setOnClickListener {
            Intent(this, com.yanghaibooo.firstcode.six.MainActivity::class.java).also(this::startActivity)
        }
        sevenChapter.setOnClickListener {
            Intent(this, IndexActivity::class.java).also(this::startActivity)
        }
        eightChapter.setOnClickListener {
            Intent(this, IndexActivity::class.java).also(this::startActivity)
        }
        nightChapter.setOnClickListener {
            Intent(this, IndexActivity::class.java).also(this::startActivity)
        }
    }
}