package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class cooking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cooking)

        val homeImageButton8 = findViewById<ImageButton>(R.id.homeImageButton8)
        val weekImageButton8 = findViewById<ImageButton>(R.id.weekImageButton8)
        val monthImageButton8 = findViewById<ImageButton>(R.id.monthImageButton8)
        val calculateButton8 = findViewById<ImageButton>(R.id.calculateButton8)

        homeImageButton8?.setOnClickListener{
            val intent = Intent(this, homepage1::class.java)
            startActivity(intent)
        }

        weekImageButton8?.setOnClickListener {
            val intent = Intent(this,sixWeekCouses::class.java)
            startActivity(intent)
        }
        monthImageButton8?.setOnClickListener{
            val intent = Intent(this, sixMonthCourses::class.java)
            startActivity(intent)
        }

        calculateButton8?.setOnClickListener {
            val intent = Intent(this, calculateFees::class.java)
            startActivity(intent)
        }






    }
}