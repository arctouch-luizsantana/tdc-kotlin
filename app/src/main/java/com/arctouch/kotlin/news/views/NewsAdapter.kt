package com.arctouch.kotlin.news.views

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.arctouch.kotlin.news.models.RedditNewsItem
import java.util.*

/**
 * Created by luizsantana on 5/4/16.
 */
class NewsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val items: ArrayList<ViewItem> = ArrayList()
    private val delegateAdapters: HashMap<Int, ViewTypeDelegateAdapter> = HashMap()
    private val loadingItem = object : ViewItem {
        override fun getType() : ViewType = ViewType.LOADING
    }

    init {
        delegateAdapters.put(ViewType.LOADING.ordinal, LoadingDelegateAdapter())
        delegateAdapters.put(ViewType.NEWS.ordinal, NewsDelegateAdapter())
        items.add(loadingItem)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        viewTypeDelegateAdapter(getItemViewType(position)).onBindViewHolder(holder, this.items[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder? {
        return viewTypeDelegateAdapter(viewType).onCreateViewHolder(parent)
    }

    override fun getItemViewType(position: Int): Int {
        return items.get(position).getType().ordinal
    }

    override fun getItemCount(): Int {
        return items.size
    }

    private fun viewTypeDelegateAdapter(type: Int) = delegateAdapters.get(type)!!

    fun addNews(news : List<RedditNewsItem>) {
        val loadPosition = items.size - 1
        items.removeAt(loadPosition)
        notifyItemRemoved(loadPosition)

        items.addAll(news)
        // add loading ao fim (scroll infinito)
        items.add(loadingItem)
        notifyItemRangeChanged(loadPosition, items.size + 1 /* mais loading */)
    }

}
