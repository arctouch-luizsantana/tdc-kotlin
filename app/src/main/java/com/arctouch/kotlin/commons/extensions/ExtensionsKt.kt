@file:JvmName("ExtensionsUtils")
package com.arctouch.kotlin.commons.extensions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by luizsantana on 5/2/16.
 */

fun ViewGroup.inflate(layoutId : Int, attachToRoot : Boolean = false) : View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}