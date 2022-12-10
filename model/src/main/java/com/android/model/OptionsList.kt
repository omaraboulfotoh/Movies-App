package com.android.model


import java.io.Serializable

data class OptionsList(
    val list: List<OptionItem>? = null,
    val map: HashMap<String, List<OptionItem>>? = null
) : Serializable {

    val isList: Boolean
        get() = list != null

    val isMap: Boolean
        get() = map != null
}
