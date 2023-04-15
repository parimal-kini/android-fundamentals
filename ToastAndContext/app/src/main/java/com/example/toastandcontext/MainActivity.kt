package com.example.toastandcontext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnToast = findViewById<Button>(R.id.btnToast)

        btnToast.setOnClickListener(){
            //Toast.makeText(applicationContext, "this is a toast msg", Toast.LENGTH_SHORT).show()
            Toast(this).apply {
                duration = Toast.LENGTH_LONG
                val clToast = findViewById<ConstraintLayout>(R.id.clToast)
                view = layoutInflater.inflate(R.layout.custom_toast, clToast)
                show()
            }
        }
    }
}