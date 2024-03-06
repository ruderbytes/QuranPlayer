package com.leafox.quranplayer.domain.repository

import com.leafox.quranplayer.data.network.model.ReciterDetailResponse
import com.leafox.quranplayer.data.network.model.ReciterResponse

interface ApiDataRepository {

    suspend fun fetchReciters(): List<ReciterResponse>

    suspend fun fetchReciterDetail(): ReciterDetailResponse

}