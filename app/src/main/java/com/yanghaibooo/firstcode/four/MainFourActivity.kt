package com.yanghaibooo.firstcode.four

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yanghaibooo.firstcode.R
import kotlinx.android.synthetic.main.activity_four_main.*

class MainFourActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_main)

        setListener()
    }

    private fun setListener() {
        openListView.setOnClickListener {

        }
        openRecycleView.setOnClickListener {

        }
        openUiBestPractice.setOnClickListener {

        }
        openUiCustomViews.setOnClickListener {

        }
        openUiLayout.setOnClickListener {

        }
        openUiWidget.setOnClickListener {

        }
    }
}