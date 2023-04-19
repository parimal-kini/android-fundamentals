package com.example.intentsandstartingactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val btnBackThird = findViewById<Button>(R.id.btnBackThird)

        btnBackThird.setOnClickListener(){
            finish()
        }
    }
}