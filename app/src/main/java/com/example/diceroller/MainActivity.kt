package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var image : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll)
        image = findViewById(R.id.imageView)

        Toast.makeText(this,"Welcome to my app",Toast.LENGTH_SHORT).show()
        rollButton.setOnClickListener {
            setDiceImage(image)
        }
    }
    private fun setDiceImage(image : ImageView){
//        val random_num = (1..6).random()
        when ((1..6).random()){
            1 -> image.setImageResource(R.drawable.dice_1)
            2 -> image.setImageResource(R.drawable.dice_2)
            3 -> image.setImageResource(R.drawable.dice_3)
            4 -> image.setImageResource(R.drawable.dice_4)
            5 -> image.setImageResource(R.drawable.dice_5)
            6 -> image.setImageResource(R.drawable.dice_6)
            else -> image.setImageResource(R.drawable.empty_dice)
        }
    }
}