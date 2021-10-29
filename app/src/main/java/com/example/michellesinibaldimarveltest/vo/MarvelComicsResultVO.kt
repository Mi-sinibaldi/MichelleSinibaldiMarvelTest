package com.example.michellesinibaldimarveltest.vo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MarvelComicsResultVO(
    val code: Int,
    val data: ComicsData
) : Parcelable