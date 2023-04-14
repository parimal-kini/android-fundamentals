package com.example.checkboxandradiobtn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rgMeat = findViewById<RadioGroup>(R.id.rgMeat)
        val checkedMeatRadioBtnId = rgMeat.checkedRadioButtonId
        val cbOnions = findViewById<CheckBox>(R.id.cbOnions)
        val cbCheese = findViewById<CheckBox>(R.id.cbCheese)
        val cbSalad = findViewById<CheckBox>(R.id.cbSalad)
        val btnOrder = findViewById<Button>(R.id.btnOrder)
        val tvOrder = findViewById<TextView>(R.id.tvOrder)


        btnOrder.setOnClickListener(){
            val meat = findViewById<RadioButton>(checkedMeatRadioBtnId)
            val onions = cbOnions.isChecked
            val cheese = cbCheese.isChecked
            val salad = cbSalad.isChecked

            val orderString = "Your Ordered a burger with:\n"+
                    "${meat.text}" +
                    (if (onions) "\n Onions" else "") +
                    (if (cheese) "\n Cheese" else "") +
                    (if (salad) "\n Salad" else "")

            tvOrder.text = orderString
        }
    }
}