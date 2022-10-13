package com.example.mat

sealed class screen(val route: String){
    object MainScreen: screen("main screen")
    object ScreenB1: screen("grid screen")
    object ScreenB2: screen("product screen")
    object ScreenB3: screen("track")
    object ScreenB4: screen("myths")
}
