package com.example.exerciciolayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()


        val button = findViewById<Button>(R.id.button_main)

        button.setOnClickListener{
            startActivity(Intent(this,VersoCartaoActivity::class.java))
        }
    }
}