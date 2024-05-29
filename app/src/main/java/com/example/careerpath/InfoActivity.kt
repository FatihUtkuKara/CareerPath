package com.example.careerpath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

private lateinit var nextButton : TextView

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        nextButton = findViewById(R.id.buttonNextText)


        nextButton.setOnClickListener{
            val intent = Intent(this, QuestionsActivity::class.java)
            startActivity(intent)
        }
    }
}