package com.faskn.app.weatherapp.core

import android.view.View
import androidx.databinding.BindingAdapter
import com.faskn.app.weatherapp.utils.extensions.hide
import com.faskn.app.weatherapp.utils.extensions.show

/**
 * Created by Furkan on 2019-10-16
 */

@BindingAdapter("app:visibility")
fun setVisibilty(view: View, isVisible: Boolean) {
    view.hide()
    if (isVisible) {
        view.show()
    } else {
        view.hide()
    }
}