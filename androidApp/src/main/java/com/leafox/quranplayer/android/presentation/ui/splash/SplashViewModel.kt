package com.leafox.quranplayer.android.presentation.ui.splash

import androidx.lifecycle.viewModelScope
import com.leafox.quranplayer.android.presentation.base.BaseViewModel
import com.leafox.quranplayer.android.presentation.base.UiState
import com.leafox.quranplayer.navigation.NavigationDirections
import kotlinx.coroutines.launch


data class SplashUiState(
    val isLoading: Boolean = true,
    val destination: String? = null
): UiState


class SplashViewModel : BaseViewModel<SplashUiState>() {
    override fun initialState() = SplashUiState()

    init {
        viewModelScope.launch {
            updateState(
                uiState.value.copy(
                    isLoading = false,
                    destination = NavigationDirections.home.destination
                )
            )
        }
    }
}