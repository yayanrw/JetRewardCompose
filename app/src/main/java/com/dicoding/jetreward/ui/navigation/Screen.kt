package com.dicoding.jetreward.ui.navigation

/**
Written by Yayan Rahmat Wijaya on 11/16/2022 04:49
Github : https://github.com/yayanrw
 **/

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Cart : Screen("cart")
    object Profile : Screen("profile")
}