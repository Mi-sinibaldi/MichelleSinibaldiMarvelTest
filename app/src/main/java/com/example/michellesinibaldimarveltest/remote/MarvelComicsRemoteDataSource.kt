package com.example.michellesinibaldimarveltest.remote

import javax.inject.Inject

class MarvelComicsRemoteDataSource @Inject constructor(
    private val marvelService: MarvelServiceAPI
) : BaseDataSource() {

    suspend fun getComics(timeStamp: String, apiKey: String, hash: String) =
        getResult { marvelService.getComics(timeStamp, apiKey, hash) }

}