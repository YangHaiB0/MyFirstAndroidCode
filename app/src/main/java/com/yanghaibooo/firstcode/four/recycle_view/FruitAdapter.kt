package com.yanghaibooo.firstcode.four.recycle_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.yanghaibooo.firstcode.R
import com.yanghaibooo.firstcode.four.Fruit
import kotlinx.android.synthetic.main.item_four_fruit.view.*

class FruitAdapter(val fruitList: List<Fruit>) : RecyclerView.Adapter<FruitAdapter.ViewHolder>() {

    // view 为 RecyclerView 子项最外层布局
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val fruitImage: ImageView = view.fruitImage
        val fruitName: TextView = view.fruitName
    }

    // 创建 ViewHolder 实例
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // 将布局加载进来
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_four_fruit, parent, false)
        // 创建实例
        val viewHolder = ViewHolder(view)

        // 最外层布局的点击事件
        viewHolder.itemView.setOnClickListener {
            val position = viewHolder.adapterPosition
            val fruit = fruitList[position]
            Toast.makeText(parent.context, "You Clicked View ${fruit.name}", Toast.LENGTH_SHORT).show()
        }

        viewHolder.fruitImage.setOnClickListener {
            val position = viewHolder.adapterPosition
            val fruit = fruitList[position]
            Toast.makeText(parent.context, "You Clicked image ${fruit.name}", Toast.LENGTH_SHORT).show()
        }
        return viewHolder
    }

    override fun getItemCount(): Int = fruitList.size

    // 对 RecyclerView 的子项进行赋值
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.run {
            fruitImage.setImageResource(fruit.imageId)
            fruitName.text = fruit.name
        }
    }
}