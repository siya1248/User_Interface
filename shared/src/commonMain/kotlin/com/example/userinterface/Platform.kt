package com.example.userinterface

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform