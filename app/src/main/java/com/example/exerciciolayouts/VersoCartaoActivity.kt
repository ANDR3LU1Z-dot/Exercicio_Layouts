package com.example.exerciciolayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class VersoCartaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verso_cartao)

        supportActionBar?.hide()

        val buttonVerso = findViewById<Button>(R.id.button_verso)

        buttonVerso.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}