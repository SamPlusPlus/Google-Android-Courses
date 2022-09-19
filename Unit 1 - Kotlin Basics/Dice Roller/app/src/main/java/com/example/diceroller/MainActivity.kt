package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result on screen
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener() {
            rollDice()
        }
    }

    /**
     * Roll the dice and update the screen with the result
     */
    private fun rollDice() {
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = Dice(6).roll().toString()
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}