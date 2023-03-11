package com.example.cypher_near.bindingadapters


import android.widget.TextView
import androidx.databinding.BindingAdapter

class charListBinding {

    companion object {
        @BindingAdapter("setPoolStats")
        @JvmStatic
        fun setPoolStats(textView: TextView, pool: Int) {
            textView.text = pool.toString()
        }
    }
}