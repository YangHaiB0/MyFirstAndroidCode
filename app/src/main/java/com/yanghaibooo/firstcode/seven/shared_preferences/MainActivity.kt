package com.yanghaibooo.firstcode.seven.shared_preferences

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.edit
import com.yanghaibooo.firstcode.R
import kotlinx.android.synthetic.main.activity_seven_sp_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven_sp_main)

        saveButton.setOnClickListener {
            getSharedPreferences("seven_data", Context.MODE_PRIVATE).edit {
                putString("name", "Tom")
                putInt("age", 28)
                putBoolean("married", false)
            }
        }
        restoreButton.setOnClickListener {
            getSharedPreferences("seven_data", Context.MODE_PRIVATE).run {
                val name = getString("name", "")
                val age = getInt("age", 0)
                val married = getBoolean("married", false)

                Log.d("MainActivity", "name is $name")
                Log.d("MainActivity", "age is $age")
                Log.d("MainActivity", "married is $married")
            }
        }
    }
}