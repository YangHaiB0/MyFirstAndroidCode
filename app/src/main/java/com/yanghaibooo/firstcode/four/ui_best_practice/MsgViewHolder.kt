package com.yanghaibooo.firstcode.four.ui_best_practice

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yanghaibooo.firstcode.R

sealed class MsgViewHolder(view: View) : RecyclerView.ViewHolder(view)

class LeftViewHolder(view: View) : MsgViewHolder(view) {
    val leftMsg: TextView = view.findViewById(R.id.leftMsg)
}

class RightViewHolder(view: View) : MsgViewHolder(view) {
    val rightMsg: TextView = view.findViewById(R.id.rightMsg)
}
