package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weightText = findViewById<EditText>(R.id.etweight)
        val heightText = findViewById<EditText>(R.id.etheight)
        val calbutton = findViewById<Button>(R.id.btnCalculate)

        calButton.setOnClickListener(){

            val weight = weightText.text.toString().toFloat();
            val height = heightText.text.toString().toFloat();
        }
    }
}
