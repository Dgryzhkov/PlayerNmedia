package com.example.playernmedia.api

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import com.example.playernmedia.BuildConfig
import com.example.playernmedia.dto.Album
/**
 *@Author Dgryzhkov
 */
private const val BASE_URL = BuildConfig.BASE_URL

private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface ApiService {
    @GET("album.json")
    suspend fun getAll(): Response<Album>

}

object Api {
    val retrofitService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}