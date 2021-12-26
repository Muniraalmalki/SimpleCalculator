package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val plus = findViewById<Button>(R.id.plus)
        val sub = findViewById<Button>(R.id.sub)
        val multiply = findViewById<Button>(R.id.multiply)
        val div = findViewById<Button>(R.id.div)
        val num1 = findViewById<EditText>(R.id.etNumber1)
        val num2 = findViewById<EditText>(R.id.etNumber2)
        val answer = findViewById<TextView>(R.id.answer)
        plus.setOnClickListener {
            val result = num1.text.toString().toDouble() + num2.text.toString().toDouble()
            answer.text = result.toString()
        }
        sub.setOnClickListener {
            val result = num1.text.toString().toDouble() - num2.text.toString().toDouble()
            answer.text = result.toString()
        }
        multiply.setOnClickListener {
            val result = num1.text.toString().toDouble() * num2.text.toString().toDouble()
            answer.text = result.toString()
        }
        div.setOnClickListener {
            val result = num1.text.toString().toDouble() / num2.text.toString().toDouble()
            answer.text = result.toString()
        }
    }
}