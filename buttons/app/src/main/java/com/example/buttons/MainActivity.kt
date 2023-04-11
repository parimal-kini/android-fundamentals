package com.example.buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnApply = findViewById<Button>(R.id.btnApply)
        val firstName = findViewById<EditText>(R.id.etFirstName)
        val lastName = findViewById<EditText>(R.id.etLastName)
        val birthDate = findViewById<EditText>(R.id.etBirthDate)
        val country = findViewById<EditText>(R.id.etCountry)

        btnApply.setOnClickListener(){
            val firstNameText = firstName.text.toString()
            val lastNameText = lastName.text.toString()
            val birthDateText = birthDate.text.toString()
            val countryText = country.text.toString()
            Log.d("Main", "$firstNameText $lastNameText born on $birthDateText in $countryText")
        }
    }
}