package com.example.isaacnewtonmotioncalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class massActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mass)

        val forceEdittext : EditText = findViewById(R.id.editText3)
        val acceleration : EditText = findViewById(R.id.editText4)
        val calculateButton : Button = findViewById(R.id.button5)

        calculateButton.setOnClickListener(){
            var force : Int = forceEdittext.text.toString().toInt()
            var acceleration : Int = acceleration.text.toString().toInt()

            var answer = calculateMass(force, acceleration)

            var i = Intent(this, answerMass::class.java)
            i.putExtra("answer", answer)
            startActivity(i)

        }


    }

    fun calculateMass (force: Int, acceleration : Int): Int{
        var mass = force / acceleration
        return mass

    }
}