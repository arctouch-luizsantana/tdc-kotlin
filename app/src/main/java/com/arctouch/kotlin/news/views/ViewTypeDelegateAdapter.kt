package com.arctouch.kotlin.news.views

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by luizsantana on 5/3/16.
 */
interface ViewTypeDelegateAdapter {
    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder
    fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewItem)
}