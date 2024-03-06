package com.leafox.quranplayer.android.presentation.ui.bottombar

import androidx.annotation.DrawableRes

data class BottomBarItem(
    @DrawableRes val icon: Int,
    val text: String,
    val route: String
)
