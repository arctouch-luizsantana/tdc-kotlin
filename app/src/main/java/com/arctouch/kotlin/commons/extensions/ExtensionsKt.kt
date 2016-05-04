@file:JvmName("ExtensionsUtils")
package com.arctouch.kotlin.commons.extensions

import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.arctouch.kotlin.R
import com.squareup.picasso.Picasso

/**
 * Created by luizsantana on 5/2/16.
 */

fun ViewGroup.inflate(layoutId : Int, attachToRoot : Boolean = false) : View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}

fun ImageView.loadImgUrl(imageUrl : String?) {
    if (TextUtils.isEmpty(imageUrl)) {
        Picasso.with(context)
                .load(R.mipmap.ic_launcher)
                .into(this)
    } else {
        Picasso.with(context)
                .load(imageUrl)
                .into(this)
    }
}