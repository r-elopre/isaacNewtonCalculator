package com.example.isaacnewtonmotioncalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class forceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_force)

        val ediTxt1 : EditText = findViewById(R.id.editText)
        val  ediTxt2 : EditText = findViewById(R.id.editText2)
        val calculateButton : Button = findViewById(R.id.button4)


        calculateButton.setOnClickListener(){
            val mass : Int = ediTxt1.text.toString().toInt()
            val acceleration : Int = ediTxt2.text.toString().toInt()

            val answer = calculateForce(mass, acceleration)

            var i = Intent(this, answerForce::class.java)
            i.putExtra("answer", answer)
            startActivity(i)

        }



    }

    fun calculateForce (mass : Int, acceleration : Int): Int{
        var force = mass * acceleration
        return force

    }
}