package com.leafox.quranplayer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform