package com.example.isaacnewtonmotioncalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val findForce: Button = findViewById(R.id.button)
        val findMass : Button = findViewById(R.id.button2)
        val findAcceleration : Button = findViewById(R.id.button3)


        findForce.setOnClickListener(){
            var f = Intent(this, forceActivity::class.java)
            startActivity(f)
        }

        findMass.setOnClickListener(){
            var m = Intent(this, massActivity::class.java)
            startActivity(m)
        }

        findAcceleration.setOnClickListener(){
            var a = Intent(this, accelerationActivity::class.java)
            startActivity(a)
        }
    }




}