package com.example.diceroller

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    private lateinit var image : ImageView
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val rootView = binding.root
        setContentView(rootView)


//        val rollButton : Button = findViewById(R.id.roll)
//        image = findViewById(R.id.imageView)

        Toast.makeText(this,"Welcome to my app ",Toast.LENGTH_SHORT).show()
        binding.roll.setOnClickListener {
            setDiceImage(binding.imageView)
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