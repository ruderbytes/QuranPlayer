package com.leafox.quranplayer.data.network

import com.leafox.quranplayer.data.network.model.ReciterDetailResponse
import com.leafox.quranplayer.data.network.model.ReciterResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class ApiService {
    private val BASE_URL = "https://ruderbytes.github.io/"
    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                useAlternativeNames = false
            })
        }
    }

    suspend fun getReciterList(): List<ReciterResponse> {
        return httpClient
            .get(BASE_URL + "reciters.json")
            .body()
    }

    suspend fun getReciterDetail(): ReciterDetailResponse {
        return httpClient
            .get(BASE_URL + "reciter_detail.json")
            .body()
    }
}