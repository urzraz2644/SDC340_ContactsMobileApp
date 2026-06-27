package com.example.contactsmobileapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.app.Activity

// Urzalla Razmowar
// June 26, 2026
// Main screen for Contacts Mobile App

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnContact1 = findViewById<Button>(R.id.btnContact1)
        val btnContact2 = findViewById<Button>(R.id.btnContact2)

        btnContact1.setOnClickListener {
            val intent = Intent(this, Contact1Activity::class.java)
            startActivity(intent)
        }

        btnContact2.setOnClickListener {
            val intent = Intent(this, Contact2Activity::class.java )
            startActivity(intent)
        }

    }
}