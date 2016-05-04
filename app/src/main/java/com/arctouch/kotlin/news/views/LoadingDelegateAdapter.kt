package com.arctouch.kotlin.news.views

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.arctouch.kotlin.R
import com.arctouch.kotlin.commons.extensions.inflate

/**
 * Created by luizsantana on 5/3/16.
 */
class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder
            = SpinnerViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) { }

    class SpinnerViewHolder(parent : ViewGroup) : RecyclerView.ViewHolder
                (parent.inflate(R.layout.news_item_loading)) {
                // infla layout dentro do container pai
    }
}