package com.example.michellesinibaldimarveltest.vo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ImageVO(
    val path: String,
    val extension: String
) : Parcelable