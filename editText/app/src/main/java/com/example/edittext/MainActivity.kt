package com.example.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNum = findViewById<EditText>(R.id.etFirstNum)
        val secondNum = findViewById<EditText>(R.id.etSecondNum)
        val result = findViewById<EditText>(R.id.etResult)
        val btnAdd = findViewById<Button>(R.id.btnAdd)

        btnAdd.setOnClickListener(){
            val first = firstNum.text.toString().toInt()
            val second = secondNum.text.toString().toInt()
            val value = first + second
            result.setText(value.toString())
        }
    }
}