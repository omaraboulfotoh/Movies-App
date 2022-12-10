package com.android.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Keep
data class OptionItem(
    @SerializedName("label")
    val label: String = "",
    @SerializedName("value")
    val value: String = "",
    @SerializedName("selected")
    val selected: Boolean = false
) : Serializable
