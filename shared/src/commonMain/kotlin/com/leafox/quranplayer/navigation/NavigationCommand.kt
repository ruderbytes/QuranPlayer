package com.leafox.quranplayer.navigation

interface NavigationCommand {

    val arguments: List<NavigationArgument>

    val destination: String
}