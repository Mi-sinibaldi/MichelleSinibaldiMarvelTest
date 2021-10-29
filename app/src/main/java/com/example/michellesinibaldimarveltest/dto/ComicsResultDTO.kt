package com.example.michellesinibaldimarveltest.dto

import android.os.Parcelable
import com.example.michellesinibaldimarveltest.vo.ImageVO
import com.example.michellesinibaldimarveltest.vo.PriceVO
import com.example.michellesinibaldimarveltest.vo.ThumbnailVO
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ComicsResultDTO(
    @SerializedName("id")
    val id: Int,

    @SerializedName("description")
    val description: String?,

    @SerializedName("title")
    val title: String,

    @SerializedName("modified")
    val modified: String,

    @SerializedName("thumbnail")
    val thumbnail: ThumbnailVO?,

    @SerializedName("pageCount")
    val pageCount: Int,

    @SerializedName("prices")
    val prices: List<PriceVO>?,

    @SerializedName("images")
    val images: List<ImageVO>?,
) : Parcelable
