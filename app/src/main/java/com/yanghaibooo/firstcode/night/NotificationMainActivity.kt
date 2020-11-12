package com.yanghaibooo.firstcode.night

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import com.yanghaibooo.firstcode.R
import kotlinx.android.synthetic.main.activity_night_notification_main.*

class NotificationMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_night_notification_main)
        // 通知跳转
        val intent = Intent(this, NotificationActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(this, 0, intent, 0)
        val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        // API 版本适配
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel("normal", "Normal", NotificationManager.IMPORTANCE_DEFAULT)
            manager.createNotificationChannel(channel)
            val channel2 = NotificationChannel("important", "Important", NotificationManager.IMPORTANCE_HIGH)
            manager.createNotificationChannel(channel2)
        }
        sendNotice.setOnClickListener {
            //创建通知具体内容
            val notification = NotificationCompat.Builder(this, "important")
                .setContentTitle("This is content title")
//                .setContentText("Learn how to build notifications, send and sync  data, and use voice actions. Get the official Android IDE and developer tools to build apps for Android")
//                .setStyle(NotificationCompat.BigTextStyle().bigText("Learn how to build notifications, send and sync  data, and use voice actions. Get the official Android IDE and developer tools to build apps for Android"))
                .setStyle(NotificationCompat.BigPictureStyle().bigPicture(BitmapFactory.decodeResource(resources, R.drawable.big_image)))
                .setSmallIcon(R.drawable.small_icon)
                .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.large_icon))
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .build()
            manager.notify(1, notification)
        }
    }
}