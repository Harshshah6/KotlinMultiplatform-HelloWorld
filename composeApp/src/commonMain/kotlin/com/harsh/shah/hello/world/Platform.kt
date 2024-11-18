package com.harsh.shah.hello.world

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform