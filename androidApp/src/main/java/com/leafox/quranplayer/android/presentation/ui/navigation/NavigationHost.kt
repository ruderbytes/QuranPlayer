package com.leafox.quranplayer.android.presentation.ui.navigation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.leafox.quranplayer.android.R
import com.leafox.quranplayer.android.presentation.ui.bookmark.BookmarkScreen
import com.leafox.quranplayer.android.presentation.ui.bottombar.BottomBarItem
import com.leafox.quranplayer.android.presentation.ui.bottombar.BottomBarNavigation
import com.leafox.quranplayer.android.presentation.ui.home.HomeScreen
import com.leafox.quranplayer.android.presentation.ui.splash.SplashScreen
import com.leafox.quranplayer.navigation.NavigationDirections
import org.koin.androidx.compose.koinViewModel

@Composable
fun NavigationHost(
    navHostController: NavHostController
) {
    val rootScreens = listOf(
        BottomBarItem(
            icon = R.drawable.ic_home,
            text = stringResource(R.string.home),
            route = NavigationDirections.home.destination,
        ),
        BottomBarItem(
            icon = R.drawable.ic_bookmarks,
            text = stringResource(R.string.bookmarks),
            route = NavigationDirections.bookmark.destination,
        )
    )
    val currentRoute = navHostController.currentBackStackEntryAsState().value?.destination?.route

    Scaffold(
        bottomBar = {
            AnimatedVisibility(visible = rootScreens.any { it.route == currentRoute }) {
                BottomBarNavigation(items = rootScreens, navController = navHostController)
            }
        }
    ) { paddingValues ->
        NavHost(
            startDestination = NavigationDirections.splash.destination,
            navController = navHostController
        ) {
            composable(NavigationDirections.splash.destination) {
                SplashScreen(
                    modifier = Modifier.padding(paddingValues),
                    viewModel = koinViewModel(),
                    navController = navHostController
                )
            }
            composable(NavigationDirections.home.destination) {
                HomeScreen(
                    modifier = Modifier.padding(paddingValues),
                    viewModel = koinViewModel(),
                    navController = navHostController
                )
            }
            composable(NavigationDirections.bookmark.destination) {
                BookmarkScreen(
                    modifier = Modifier.padding(paddingValues),
                    viewModel = koinViewModel(),
                    navController = navHostController
                )
            }
        }
    }
}