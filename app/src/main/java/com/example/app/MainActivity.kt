package com.example.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openSecondActivityButton = findViewById<Button>(R.id.openSecondActivityButton)
        openSecondActivityButton.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}
