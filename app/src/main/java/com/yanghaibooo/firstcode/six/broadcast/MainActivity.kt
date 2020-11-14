package com.yanghaibooo.firstcode.six.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.yanghaibooo.firstcode.R
import kotlinx.android.synthetic.main.activity_six_broadcast_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var timeChangeReceiver: TimeChangeReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_broadcast_main)

        button.setOnClickListener {
            val intent = Intent("com.yanghaibooo.firstcode.six.broadcast.MY_BROADCAST")
            intent.setPackage(packageName)

//            sendBroadcast(intent)
            sendOrderedBroadcast(intent, null)
        }
        // 动态注册 添加过滤 只接收 TIME_TICK 的广播
        val intentFilter = IntentFilter()
        intentFilter.addAction("android.intent.action.TIME_TICK")
        timeChangeReceiver = TimeChangeReceiver()
        registerReceiver(timeChangeReceiver, intentFilter)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(timeChangeReceiver)
    }

    inner class TimeChangeReceiver : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            Toast.makeText(context, "Time has changed", Toast.LENGTH_SHORT).show()
        }
    }
}