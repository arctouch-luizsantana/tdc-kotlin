package com.arctouch.kotlin.news.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arctouch.kotlin.R
import com.arctouch.kotlin.commons.extensions.inflate
import kotlinx.android.synthetic.main.fragment_news.*

/**
 * Created by luizsantana on 5/2/16.
 */
class NewsFragment : Fragment() {

    private val newsList by lazy {
        news_list
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.fragment_news)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        newsList.setHasFixedSize(true) // Executado de maneira Lazy
        newsList.layoutManager = LinearLayoutManager(context)
    }
}