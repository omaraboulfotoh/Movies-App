package com.android.core.extension

import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData


fun <T> MutableLiveData<T>.asLiveData() = this as LiveData<T>
fun <T> Fragment.observe(liveData: LiveData<T>, block: (T) -> Unit) {
    liveData.observe(
        this.viewLifecycleOwner,
        {
            if (it != null) block.invoke(it)
        }
    )
}


