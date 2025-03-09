package com.example.traduttoremorsesemaforico

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform