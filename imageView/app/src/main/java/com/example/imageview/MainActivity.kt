package com.example.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ivImage = findViewById<ImageView>(R.id.ivImage)
        val btnAddImg = findViewById<Button>(R.id.btnAddImg)
        val btnRmvImg = findViewById<Button>(R.id.btnRmvImg)

        btnAddImg.setOnClickListener(){
            ivImage.setImageResource(R.drawable.bike)
        }

        btnRmvImg.setOnClickListener(){
            ivImage.setImageBitmap(null)
        }
    }
}