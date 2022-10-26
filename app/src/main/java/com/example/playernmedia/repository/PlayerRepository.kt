package com.example.playernmedia.repository

import com.example.playernmedia.dto.Album

/**
 *@Author Dgryzhkov
 */
interface PlayerRepository {
    suspend fun getAll(): Album
}