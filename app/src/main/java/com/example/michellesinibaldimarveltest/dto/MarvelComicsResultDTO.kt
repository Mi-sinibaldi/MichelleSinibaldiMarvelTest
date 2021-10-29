package com.example.michellesinibaldimarveltest.dto

import android.os.Parcelable
import com.example.michellesinibaldimarveltest.vo.ComicsData
import com.google.gson.annotations.SerializedName
import kotlinx.androidx.parcel.Parcelize

@Parcelize
data class MarvelComicsResultDTO(
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val data: ComicsData
) : Parcelable
