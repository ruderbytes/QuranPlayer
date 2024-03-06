package com.leafox.quranplayer.data.network.model

import com.leafox.quranplayer.data.entity.ReciterData
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ReciterDetailResponse(
    @SerialName("info")
    val info: ReciterData,
    @SerialName("playlist")
    val playlist: List<Playlist>
    ) {
    @Serializable
    data class Playlist(
        @SerialName("id")
        val id: Long,
        @SerialName("surah")
        val surah: String,
        @SerialName("description")
        val description: String,
        @SerialName("url")
        val url: String,
        @SerialName("lyrics")
        val lyrics: String
    )
}