package com.carrom.aimmaster

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.view.Gravity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val screen = TextView(this)
        screen.text = "Carrom AI Master\n\nWelcome!\n\nShot Assistant"
        screen.textSize = 24f
        screen.gravity = Gravity.CENTER

        setContentView(screen)
    }
}
