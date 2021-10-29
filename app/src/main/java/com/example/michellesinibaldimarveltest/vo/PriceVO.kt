package com.example.michellesinibaldimarveltest.vo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PriceVO(
    val type: String,
    val price: Double
) : Parcelable