package com.example.isaacnewtonmotioncalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class answerAcceleration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_acceleration)

        val answerTxtView : TextView = findViewById(R.id.textView11)

        var displayAnswer = answerTxtView.setText(receiveAnswer())


    }

    fun receiveAnswer (): String{
        var bundle: Bundle? = intent.extras
        var answer = bundle?.get("answer").toString()
        return answer
    }
}