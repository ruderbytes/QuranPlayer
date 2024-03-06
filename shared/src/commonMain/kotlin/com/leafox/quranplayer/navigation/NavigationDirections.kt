package com.leafox.quranplayer.navigation

object NavigationDirections {

    val auth  = object : NavigationCommand {

        override val arguments = emptyList<NavigationArgument>()

        override val destination = "auth"

    }

    val splash  = object : NavigationCommand {

        override val arguments = emptyList<NavigationArgument>()

        override val destination = "splash"

    }

    val home = object : NavigationCommand {

        override val arguments = emptyList<NavigationArgument>()

        override val destination = "home"
    }

    val bookmark = object : NavigationCommand {

        override val arguments = emptyList<NavigationArgument>()

        override val destination = "bookmark"
    }
}