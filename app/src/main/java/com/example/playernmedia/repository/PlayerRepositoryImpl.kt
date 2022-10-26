package com.example.playernmedia.repository

import com.example.playernmedia.api.Api
import com.example.playernmedia.dto.Album
import com.example.playernmedia.error.ApiError
import com.example.playernmedia.error.NetworkError
import com.example.playernmedia.error.UnknownError
import java.io.IOException

/**
 *@Author Dgryzhkov
 */
class PlayerRepositoryImpl : PlayerRepository {
    override suspend fun getAll(): Album {
        try {
            val response = Api.retrofitService.getAll()
            if (!response.isSuccessful) {
                throw ApiError(response.code(), response.message())
            }
            return response.body() ?: throw Exception()
        } catch (e: IOException) {
            throw NetworkError
        } catch (e: Exception) {
            throw UnknownError
        }
    }
}