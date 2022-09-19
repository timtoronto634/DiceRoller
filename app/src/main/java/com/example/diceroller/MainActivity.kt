package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var diceImage : ImageView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
//        val countupButton: Button = findViewById(R.id.countup_button)
//        countupButton.setOnClickListener { countupNumber() }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        val diceImage: ImageView = findViewById(R.id.dice_image)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }

//    private fun countupNumber() {
//        val resultText: TextView = findViewById(R.id.result_text)
//        val updated: Int = when (val num = resultText.text.toString().toIntOrNull()) {
//            null -> {
//                1
//            }
//            6 -> {
//                6
//            }
//            else -> {
//                num + 1
//            }
//        }
//        resultText.text = updated.toString()
//    }
}