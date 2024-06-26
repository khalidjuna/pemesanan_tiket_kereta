package com.example.tiketkereta.navigation

import com.example.tiketkereta.R
import com.example.tiketkereta.screen.destinations.BlankScreenDestination
import com.example.tiketkereta.screen.destinations.Destination
import com.example.tiketkereta.screen.destinations.HomeScreenDestination
import com.example.tiketkereta.screen.destinations.TrainScreenDestination

sealed class BottomNavItem(
    val title: String,
    val icon: Int,
    val destination: Destination
){
    data object HomeScreen : BottomNavItem(
        title = "Home",
        icon = R.drawable.outline_home_24,
        destination = HomeScreenDestination
    )

    data object TrainScreen : BottomNavItem(
        title = "Train",
        icon = R.drawable.img_train,
        destination = TrainScreenDestination
    )

    data object BookmarkScreen : BottomNavItem(
        title = "Bookmark",
        icon = R.drawable.bookmark,
        destination = BlankScreenDestination
    )

    data object NotificationScreen : BottomNavItem(
        title = "Notification",
        icon = R.drawable.notification,
        destination = BlankScreenDestination
    )
}