package com.yanghaibooo.firstcode.three

import android.os.Bundle
import android.util.Log
import com.yanghaibooo.firstcode.R
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ThirdActivity", "Task id is $taskId")
        setContentView(R.layout.activity_third)
        button3.setOnClickListener {
            ActivityBox.finishAll()
        }
    }
}