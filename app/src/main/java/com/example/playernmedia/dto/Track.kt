package com.example.playernmedia.dto

/**
 *@Author Dgryzhkov
 */
data class Track(
    val id: Long,
    val file: String,
    val titleAlbum: String?,
    val running: Boolean = false
)