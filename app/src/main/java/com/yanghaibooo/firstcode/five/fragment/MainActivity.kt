package com.yanghaibooo.firstcode.five.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.yanghaibooo.firstcode.R
import kotlinx.android.synthetic.main.fragment_left.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five_fragment_main)

//        replaceFragment(RightFragment())
        button.setOnClickListener {
            replaceFragment(AnotherRightFragment())
        }
        replaceFragment(RightFragment())
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.leftFrag, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}