package com.example.helloworld

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.core.graphics.drawable.toDrawable
import java.util.*


class MainActivity : AppCompatActivity() {
    lateinit var rollImageNumber: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.roll_button)
        rollButton.text = "Lets Roll"

        rollImageNumber = findViewById(R.id.roll_image)

        fun rollDice() {
            val randomNumber = Random().nextInt(6) + 1

            val drwableResoruce = when(randomNumber) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            rollImageNumber.setImageResource(drwableResoruce)
        }

        rollButton.setOnClickListener{
            // Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show()
            rollDice()
        }

    }
}