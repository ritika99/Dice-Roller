package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage1 : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)

        val clearButton: Button = findViewById(R.id.clear_button)
        clearButton.setOnClickListener { clearDice() }

//        val countButton: Button = findViewById(R.id.count_up)
//        countButton.setOnClickListener { countUp() }

//        val resetButton: Button = findViewById(R.id.reset_button)
//        reset_button.setOnClickListener { result_text.text = "0" }
    }

    private fun rollDice(){
        Toast.makeText(this, "Button Clicked !!!", Toast.LENGTH_SHORT).show()

//        val randomInt = (1..6).random()
//
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = "Dice Rolled!"
//        resultText.text = randomInt.toString()

//        val diceImage: ImageView = findViewById(R.id.dice_image)
//        val drawableResource = when(randomInt){
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }

        diceImage1.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
    }

    private fun getRandomDiceImage() : Int {
        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    private fun clearDice(){
        diceImage1.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
    }

//    private fun countUp(){
//        val c = result_text.text.toString()
//        if(c == "Hello World!"){
//            count_up.text = "1"
//        }
//        else if(c != "6"){
//            count_up.text = (c.toInt() + 1).toString()
//        }



}
