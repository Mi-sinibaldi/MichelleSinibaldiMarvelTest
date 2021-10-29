package com.example.michellesinibaldimarveltest.remote

import com.example.michellesinibaldimarveltest.dto.MarvelComicsResultDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelServiceAPI {
    @GET("v1/public/comics")
    suspend fun getComics(
        @Query("ts") timeStamp: String,
        @Query("apikey") apikey: String,
        @Query("hash") hash: String
    ): Response<MarvelComicsResultDTO>
}