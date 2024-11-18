package com.harsh.shah.hello.world

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Hello World",
    ) {
        App()
    }
}