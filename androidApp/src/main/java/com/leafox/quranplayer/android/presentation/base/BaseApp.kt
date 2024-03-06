package com.leafox.quranplayer.android.presentation.base

import android.app.Application
import com.leafox.quranplayer.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class BaseApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@BaseApp)
            modules(
                appModule()
            )
        }
    }
}