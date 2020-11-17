package com.yanghaibooo.firstcode.seven.shared_preferences

import android.content.SharedPreferences

fun SharedPreferences.open(block: SharedPreferences.Editor.() -> Unit) {
    edit().run {
        block()
        apply()
    }
}