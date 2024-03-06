package com.leafox.quranplayer.data.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ReciterData(
    @SerialName("id")
    val id: Long,
    @SerialName("name")
    val syaikhID: String,
    @SerialName("imageUrl")
    val name: String,
    @SerialName("kind")
    val origin: String
)