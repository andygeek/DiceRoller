package com.andygeek.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var img_dice : ImageView
    lateinit var btn_init : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img_dice = findViewById(R.id.img_dice)
        btn_init = findViewById(R.id.btn_dice)

        btn_init.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice(){

        val drawableResource = when (randomInt()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        img_dice.setImageResource(drawableResource)
    }

    private fun randomInt() : Int {
        val randomInt = (1..6).random()
        return randomInt
    }


}