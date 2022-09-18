package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val countupButton: Button = findViewById(R.id.countup_button)
        countupButton.setOnClickListener { countupNumber() }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun countupNumber() {
        val resultText: TextView = findViewById(R.id.result_text)
        val updated: Int = when (val num = resultText.text.toString().toIntOrNull()) {
            null -> {
                1
            }
            6 -> {
                6
            }
            else -> {
                num + 1
            }
        }
        resultText.text = updated.toString()
    }
}