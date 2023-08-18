package com.example.isaacnewtonmotioncalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class answerForce : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_force)

        val answer : TextView = findViewById(R.id.textView7)

        var finalAnswer = receiveAnswer()
        var displayAnswer = answer.setText(receiveAnswer())



    }

    fun receiveAnswer (): String{
        var bundle: Bundle? = intent.extras
        var answer = bundle?.get("answer").toString()
        return answer
    }
}