package com.example.isaacnewtonmotioncalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class accelerationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acceleration)

        val forceEditText : EditText = findViewById(R.id.editText5)
        val mass : EditText = findViewById(R.id.editText6)
        val calculateButton : Button = findViewById(R.id.button6)

        calculateButton.setOnClickListener(){
            var forceEntered : Int = forceEditText.text.toString().toInt()
            var massEntered : Int = mass.text.toString().toInt()

            var answer = calculateAcceleration(forceEntered, massEntered)

            var i = Intent(this, answerAcceleration::class.java)
            i.putExtra("answer", answer)
            startActivity(i)

        }

    }

    fun calculateAcceleration(force: Int, mass : Int): Int{
        var acceleration = force / mass
        return acceleration

    }
}