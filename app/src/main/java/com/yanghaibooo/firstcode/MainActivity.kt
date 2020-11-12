package com.yanghaibooo.firstcode

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yanghaibooo.firstcode.four.MainFourActivity
import com.yanghaibooo.firstcode.one.MainOneActivity
import com.yanghaibooo.firstcode.three.MainThreeActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }

    private fun setListener() {
        oneChapter.setOnClickListener {
            Intent(this, MainOneActivity::class.java).also(this::startActivity)
        }
        twoChapter.setOnClickListener {
            Intent(this, com.yanghaibooo.firstcode.two.hello_world.MainActivity::class.java).also(this::startActivity)
        }
        threeChapter.setOnClickListener {
            Intent(this, MainThreeActivity::class.java).also(this::startActivity)
        }
        fourChapter.setOnClickListener {
            Intent(this, MainFourActivity::class.java).also(this::startActivity)
        }
        fiveChapter.setOnClickListener {
            Intent(this, MainActivity::class.java).also(this::startActivity)
        }
        sixChapter.setOnClickListener {
            Intent(this, MainActivity::class.java).also(this::startActivity)
        }
        sevenChapter.setOnClickListener {
            Intent(this, MainActivity::class.java).also(this::startActivity)
        }
        eightChapter.setOnClickListener {
            Intent(this, MainActivity::class.java).also(this::startActivity)
        }
        nightChapter.setOnClickListener {
            Intent(this, MainActivity::class.java).also(this::startActivity)
        }
    }
}