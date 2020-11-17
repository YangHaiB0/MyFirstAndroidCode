package com.yanghaibooo.firstcode.seven

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yanghaibooo.firstcode.R
import kotlinx.android.synthetic.main.activity_main_seven.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_seven)

        openSharedPreferences.setOnClickListener {
            Intent(this, com.yanghaibooo.firstcode.seven.shared_preferences.MainActivity::class.java).also(this::startActivity)
        }

        openDatabase.setOnClickListener {
            Intent(this, com.yanghaibooo.firstcode.seven.database.MainActivity::class.java).also(this::startActivity)
        }
    }
}