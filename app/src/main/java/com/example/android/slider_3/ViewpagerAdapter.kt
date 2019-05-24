package com.example.android.slider_3

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter

class ViewpagerAdapter (val context: Context): PagerAdapter() {
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val layoutInflater: LayoutInflater =
            (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater)
        val view:View=layoutInflater.inflate(R.layout.viewpagerimage,container,false)
        val imageView: ImageView =view.findViewById(R.id.image_slider)
        imageView.setImageResource(R.drawable.viewpager)
        view.setOnClickListener {
            val intent = Intent(view.context, HActivity::class.java)
            view.context.startActivity(intent)
        }
        container.addView(view)
        return view
    }
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
       return view==`object`
    }

    override fun getCount(): Int {
        return 5
    }
    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val view:View=`object`as View
        container.removeView(view)
    }
}