package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class lifeSkills : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_skills)

        val homeImageButton6 = findViewById<ImageButton>(R.id.homeImageButton6)
        val weekImageButton6 = findViewById<ImageButton>(R.id.weekImageButton6)
        val monthImageButton6 = findViewById<ImageButton>(R.id.monthImageButton6)
        val calculateButton6 = findViewById<ImageButton>(R.id.calculateButton6)

        homeImageButton6?.setOnClickListener{
            val intent = Intent(this, homepage1::class.java)
            startActivity(intent)
        }

        weekImageButton6?.setOnClickListener {
            val intent = Intent(this,sixWeekCouses::class.java)
            startActivity(intent)
        }
        monthImageButton6?.setOnClickListener{
            val intent = Intent(this, sixMonthCourses::class.java)
            startActivity(intent)
        }

        calculateButton6?.setOnClickListener {
            val intent = Intent(this, calculateFees::class.java)
            startActivity(intent)
        }




    }
}