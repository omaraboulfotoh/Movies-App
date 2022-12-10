package com.android.core.bases

import android.graphics.Color
import android.graphics.Paint
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.databinding.BindingAdapter
import com.android.core.R
import com.android.core.util.CircleTransform
import com.android.core.util.RoundedCornersTransformation
import com.google.android.material.progressindicator.LinearProgressIndicator
import com.squareup.picasso.Picasso


@BindingAdapter(value = ["color"])
fun bindColor(view: TextView, color: String?) {
    color?.let {
        view.setTextColor(Color.parseColor(it))
    }
}

@BindingAdapter(value = ["color"])
fun bindColor(view: CardView, color: String?) {
    color?.let {
        view.setCardBackgroundColor(Color.parseColor(it))
    }
}

@BindingAdapter(value = ["bind:progressColor"])
fun bindProgressColor(view: LinearProgressIndicator, color: Int) {
    view.setIndicatorColor(color)
}

@BindingAdapter(value = ["bind:textColor"])
fun bindTextColor(view: TextView, color: Int) {
    view.setTextColor(color)
}


@BindingAdapter("imageUrl")
fun ImageView.loadImage(imageUrl: String?) {

    if (!imageUrl.isNullOrEmpty())
        Picasso.get()
            .load(imageUrl)
            .placeholder(R.color.light_grey)
            .into(this)
    else
        setImageResource(R.color.light_grey)

}

@BindingAdapter("imageCompleteUrl")
fun ImageView.loadImageFromUrl(imageUrl: String?) {
    if (!imageUrl.isNullOrEmpty())
        Picasso.get()
            .load(imageUrl)
            .placeholder(R.color.light_grey)
            .into(this)

}

@BindingAdapter("imageUrlCircle")
fun ImageView.loadCircleImage(imageUrl: String?) {
    if (!imageUrl.isNullOrEmpty())
        Picasso.get()
            .load(imageUrl)
            .placeholder(R.color.light_grey)
            .transform(CircleTransform())
            .into(this)
}

@BindingAdapter("imageUrlRounded")
fun ImageView.loadRoundImage(imageUrl: String?) {
    if (!imageUrl.isNullOrEmpty())
        Picasso.get()
            .load(imageUrl)
            .placeholder(R.color.light_grey)
            .transform(RoundedCornersTransformation(20, 10))
            .into(this)
}

@BindingAdapter("imageCompleteUrlRounded")
fun ImageView.loadRoundCompleteImage(imageUrl: String?) {
    if (!imageUrl.isNullOrEmpty())
        Picasso.get()
            .load(imageUrl)
            .placeholder(R.color.light_grey)
            .transform(RoundedCornersTransformation(50, 0))
            .into(this)
}

@BindingAdapter("imageCompleteUrlCircle")
fun ImageView.loadCircleImageFromUrl(imageUrl: String?) {
    if (!imageUrl.isNullOrEmpty())
        Picasso.get()
            .load(imageUrl)
            .placeholder(R.color.light_grey)
            .transform(CircleTransform())
            .into(this)
}

@BindingAdapter("imageSrc")
fun ImageView.loadImage(imageSrc: Int) {
    if (imageSrc != -1)
        this.setImageResource(imageSrc)

}

@BindingAdapter("textSrc")
fun TextView.loadText(textSrc: Int) {
    if (textSrc != -1)
        this.setText(textSrc)
}

@BindingAdapter("textColorSrc")
fun TextView.setTextColor(textColor: String?) {
    if (textColor != null)
        this.setTextColor(Color.parseColor(textColor))
}

@BindingAdapter("viewColorSrc")
fun ImageView.setTintColor(textColor: String?) {
    if (textColor != null)
        this.setColorFilter(Color.parseColor(textColor))
}

@BindingAdapter("setBackgroundSrc")
fun View.setBackground(backgroundSrc: Int) {
    if (backgroundSrc != -1)
        this.setBackgroundResource(backgroundSrc)
}

@BindingAdapter("setBackgroundColor")
fun View.setBackgroundColor(bgColor: String?) {
    if (bgColor != null)
        this.setBackgroundColor(Color.parseColor(bgColor))
}

@BindingAdapter("strikethrough")
fun TextView.strikethrough(show: Boolean) {
    this.paintFlags = if (show) {
        this.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
    } else {
        this.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
    }
}
