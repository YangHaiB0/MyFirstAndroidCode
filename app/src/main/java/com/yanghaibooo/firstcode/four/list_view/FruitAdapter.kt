package com.yanghaibooo.firstcode.four.list_view

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.yanghaibooo.firstcode.four.Fruit
import kotlinx.android.synthetic.main.item_four_fruit.view.*

class FruitAdapter(activity: Activity, val resourceId: Int, data: List<Fruit>) : ArrayAdapter<Fruit>(activity, resourceId, data) {

    // 在每个子项滚动到屏幕外被调用 convertView 缓存布局
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        val viewHolder: ViewHolder

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(resourceId, parent, false)
            val fruitImage: ImageView = view.fruitImage
            val fruitName: TextView = view.fruitName
            viewHolder = ViewHolder(fruitImage, fruitName)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        // 获得当前项的实例
        val fruit = getItem(position)
        if (fruit != null) {
            viewHolder.fruitImage.setImageResource(fruit.imageId)
            viewHolder.fruitName.text = fruit.name
        }
        return view
    }

    // 对 ImageView 和 TextView 进行缓存
    inner class ViewHolder(val fruitImage: ImageView, val fruitName: TextView)
}