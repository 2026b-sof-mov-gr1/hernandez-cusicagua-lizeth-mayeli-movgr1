package com.example.lh_kotlinm_2026bmovgr1

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return sayHello(platform.name)
    }
}