package com.example.diceroll

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton: Button = findViewById(R.id.button)
        rollbutton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceroll = dice.roll()
        val resulttextview: TextView = findViewById(R.id.textView)
        resulttextview.text = diceroll.toString()
    }
}

class Dice(val numsides: Int) {
    fun roll(): Int {
        return (1..numsides).random()
    }
}