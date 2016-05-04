package com.arctouch.kotlin.news.views

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.arctouch.kotlin.R
import com.arctouch.kotlin.commons.extensions.inflate
import com.arctouch.kotlin.commons.extensions.loadImgUrl
import com.arctouch.kotlin.news.models.RedditNewsItem
import kotlinx.android.synthetic.main.news_item.view.*

/**
 * Created by luizsantana on 5/4/16.
 */
class NewsDelegateAdapter : ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder = NewsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewItem) {
        holder as NewsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class NewsViewHolder(parent : ViewGroup) : RecyclerView.ViewHolder
        (parent.inflate(R.layout.news_item)) {

        fun bind(item : RedditNewsItem) = with(itemView) {
            img_thumbnail.loadImgUrl(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.commentsNumber} comments"
        }
    }
}