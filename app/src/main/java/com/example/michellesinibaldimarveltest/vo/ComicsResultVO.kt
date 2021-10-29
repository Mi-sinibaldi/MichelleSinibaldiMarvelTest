package com.example.michellesinibaldimarveltest.vo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ComicsResultVO(
    val id: Int,
    val description: String?,
    val title: String,
    val modified: String,
    val thumbnail: ThumbnailVO?,
    val pageCount: Int,
    val prices: List<PriceVO>?,
    val images: List<ImageVO>?,
) : Parcelable
