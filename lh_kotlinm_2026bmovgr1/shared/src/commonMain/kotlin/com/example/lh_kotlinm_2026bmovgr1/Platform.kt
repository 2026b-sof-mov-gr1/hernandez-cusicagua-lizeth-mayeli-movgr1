package com.example.lh_kotlinm_2026bmovgr1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform