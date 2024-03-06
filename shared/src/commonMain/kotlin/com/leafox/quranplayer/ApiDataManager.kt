package com.leafox.quranplayer

import com.leafox.quranplayer.data.network.ApiService
import com.leafox.quranplayer.data.network.model.ReciterDetailResponse
import com.leafox.quranplayer.data.network.model.ReciterResponse

class ApiDataManager {
    private val api = ApiService()

    @Throws(Exception::class)
    suspend fun getReciters(): List<ReciterResponse> {
        return api.getReciterList()
    }
    @Throws(Exception::class)
    suspend fun getReciterDetail(): ReciterDetailResponse {
        return api.getReciterDetail()
    }
}