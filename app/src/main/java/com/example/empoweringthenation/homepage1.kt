package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class homepage1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage1)

    val homeImageButton = findViewById<ImageButton>(R.id.homeImageButton)
    val weekImageButton = findViewById<ImageButton>(R.id.weekImageButton)
    val monthImageButton = findViewById<ImageButton>(R.id.monthImageButton)
    val calculateButton = findViewById<ImageButton>(R.id.calculateButton)


    monthImageButton?.setOnClickListener{

        val intent = Intent(this,sixMonthCourses::class.java)
        startActivity(intent)
    }

    weekImageButton?.setOnClickListener{
        val intent = Intent(this,sixWeekCouses::class.java)
        startActivity(intent)
    }

        calculateButton?.setOnClickListener {
            val intent = Intent(this, calculateFees::class.java)
            startActivity(intent)

        }






    }
}