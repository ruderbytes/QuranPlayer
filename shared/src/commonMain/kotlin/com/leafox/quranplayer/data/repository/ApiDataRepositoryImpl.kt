package com.leafox.quranplayer.data.repository

import com.leafox.quranplayer.ApiDataManager
import com.leafox.quranplayer.data.network.model.ReciterDetailResponse
import com.leafox.quranplayer.data.network.model.ReciterResponse
import com.leafox.quranplayer.domain.repository.ApiDataRepository

class ApiDataRepositoryImpl(
    private val apiDataManager: ApiDataManager
): ApiDataRepository {

    override suspend fun fetchReciters(): List<ReciterResponse> {
        return apiDataManager.getReciters()
    }

    override suspend fun fetchReciterDetail(): ReciterDetailResponse {
        return apiDataManager.getReciterDetail()
    }

}