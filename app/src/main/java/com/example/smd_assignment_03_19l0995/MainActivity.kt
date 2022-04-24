package com.example.smd_assignment_03_19l0995

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        val register = findViewById<View>(R.id.btn_login) as Button
        register.setOnClickListener {
            startActivity(Intent(this@MainActivity, RegisterPage::class.java))
        }
    }
}