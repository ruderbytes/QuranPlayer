package com.leafox.quranplayer.android.presentation.ui.bottombar

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.leafox.quranplayer.android.presentation.ui.bottombar.BottomBarDimension.BottomNavigatorHeight
import com.leafox.quranplayer.android.presentation.ui.theme.spacing

@Composable
fun BottomBarNavigation(
    modifier: Modifier = Modifier,
    items: List<BottomBarItem>,
    navController: NavController,
    selectedColor: Color = MaterialTheme.colorScheme.primary,
    unselectedColor: Color = MaterialTheme.colorScheme.surface
) {
    val currentRoute = navController.currentBackStackEntryAsState().value
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(BottomNavigatorHeight)
    ) {
        items.forEach {
            val isCurrentRouteSelected = currentRoute?.destination?.route == it.route
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clickable { navController.navigate(it.route) }
                    .background(if (isCurrentRouteSelected) selectedColor else unselectedColor)
                    .padding(vertical = MaterialTheme.spacing.small),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(id = it.icon),
                    contentDescription = ""
                )
                Text(text = it.text)
            }
        }
    }
}