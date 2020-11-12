package com.yanghaibooo.firstcode.night

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yanghaibooo.firstcode.R
import kotlinx.android.synthetic.main.activity_night_media.*

class MediaActivity : AppCompatActivity() {
    private val mediaPlayer = MediaPlayer()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_night_media)
        // 获得音频 初始化播放器
        initMediaPlayer()

        play.setOnClickListener {
            if (!mediaPlayer.isPlaying) mediaPlayer.start()
        }
        pause.setOnClickListener {
            if (mediaPlayer.isPlaying) mediaPlayer.pause()

        }
        stop.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                mediaPlayer.reset()
                initMediaPlayer()
            }
        }
    }

    private fun initMediaPlayer() {
        val assetManager = assets
        val fd = assetManager.openFd("music.mp3")
        mediaPlayer.setDataSource(fd.fileDescriptor, fd.startOffset, fd.length)
        mediaPlayer.prepare()
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.stop()
        mediaPlayer.release()
    }
}