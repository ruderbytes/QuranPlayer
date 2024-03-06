package com.leafox.quranplayer.data.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ReciterResponse(
    @SerialName("id")
    val id: Long,
    @SerialName("syaikhID")
    val syaikhID: String,
    @SerialName("name")
    val name: String,
    @SerialName("origin")
    val origin: String,
)