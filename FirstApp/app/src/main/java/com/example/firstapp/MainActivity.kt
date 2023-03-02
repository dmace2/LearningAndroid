package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// this creates an activity for the app to run
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}