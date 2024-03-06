package com.leafox.quranplayer.di

import com.leafox.quranplayer.ApiDataManager
import com.leafox.quranplayer.data.repository.ApiDataRepositoryImpl
import com.leafox.quranplayer.domain.repository.ApiDataRepository
import org.koin.dsl.module

fun appModule() = module {
    single<ApiDataManager> { ApiDataManager() }

    single<ApiDataRepository> { ApiDataRepositoryImpl(get()) }
}