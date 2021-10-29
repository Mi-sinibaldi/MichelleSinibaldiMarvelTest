package com.example.dhmarvel03.repository

import com.example.githubapp.utils.performGetOperation
import com.example.michellesinibaldimarveltest.remote.MarvelComicsRemoteDataSource
import javax.inject.Inject

class MarvelComicsRepository @Inject constructor(
    private val remoteDataSource: MarvelComicsRemoteDataSource
) {

    fun getComics(timeStamp: String, apiKey: String, hash: String) = performGetOperation(
        networkCall = { remoteDataSource.getComics(timeStamp, apiKey, hash) }
    )
}