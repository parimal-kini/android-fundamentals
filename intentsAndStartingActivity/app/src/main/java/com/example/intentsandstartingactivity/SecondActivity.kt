package com.example.intentsandstartingactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnfwd = findViewById<Button>(R.id.btnfwd)

        btnBack.setOnClickListener(){
            finish()
        }

        btnfwd.setOnClickListener(){
            Intent(this, ThirdActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}