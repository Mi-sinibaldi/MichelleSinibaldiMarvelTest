package com.example.michellesinibaldimarveltest.vo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ComicsData(
    val offset: Int,
    val limit: Int,
    val total: Int,
    val count: Int,
    val results: List<ComicsResultVO>
) : Parcelable