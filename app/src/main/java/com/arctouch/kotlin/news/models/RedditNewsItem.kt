package com.arctouch.kotlin.news.models

import com.arctouch.kotlin.news.views.ViewItem
import com.arctouch.kotlin.news.views.ViewType

/**
 * Created by luizsantana on 5/4/16.
 */
data class RedditNewsItem(
        var author: String,
        var title: String,
        var thumbnail: String,
        var commentsNumber:Int) : ViewItem {

    override fun getType(): ViewType = ViewType.NEWS
}