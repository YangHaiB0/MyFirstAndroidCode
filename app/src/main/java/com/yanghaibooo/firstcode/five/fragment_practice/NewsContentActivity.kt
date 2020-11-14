package com.yanghaibooo.firstcode.five.fragment_practice

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yanghaibooo.firstcode.R
import kotlinx.android.synthetic.main.activity_five_frag_practice_news_content.*

class NewsContentActivity : AppCompatActivity() {
    companion object {
        fun actionStart(context: Context, title: String, content: String) {
            val intent = Intent(context, NewsContentActivity::class.java).apply {
                putExtra("news_title", title);
                putExtra("news_content", content)
            }
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five_frag_practice_news_content)
        val title = intent.getStringExtra("news_title") // 获取传入的新 闻标题
        val content = intent.getStringExtra("news_content") // 获取传入 的新闻内容
        if (title != null && content != null) {
            val fragment = newsContentFrag as NewsContentFragment
            fragment.refresh(title, content) //刷新NewsContentFragment界面
        }
    }
}