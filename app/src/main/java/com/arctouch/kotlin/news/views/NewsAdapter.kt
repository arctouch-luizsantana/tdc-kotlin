package com.arctouch.kotlin.news.views

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import java.util.*

/**
 * Created by luizsantana on 5/4/16.
 */
class NewsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val items: ArrayList<ViewItem> = ArrayList()
    private val delegateAdapters: HashMap<ViewType, ViewTypeDelegateAdapter> = HashMap()
    private val loadingItem = object : ViewItem {
        override fun getType() : ViewType = ViewType.LOADING
    }

    init {
        delegateAdapters.put(ViewType.LOADING, LoadingDelegateAdapter())
        items.add(loadingItem)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        throw UnsupportedOperationException()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder? {
        throw UnsupportedOperationException()
    }

    override fun getItemCount(): Int {
        throw UnsupportedOperationException()
    }

}
