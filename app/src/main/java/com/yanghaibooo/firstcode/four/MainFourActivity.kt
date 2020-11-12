package com.yanghaibooo.firstcode.four

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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