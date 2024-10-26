package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class gardenMaintenance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_garden_maintenance)

        val homeImageButton9 = findViewById<ImageButton>(R.id.homeImageButton9)
        val weekImageButton9 = findViewById<ImageButton>(R.id.weekImageButton9)
        val monthImageButton9 = findViewById<ImageButton>(R.id.monthImageButton9)
        val calculateButton9 = findViewById<ImageButton>(R.id.calculateButton9)

        homeImageButton9?.setOnClickListener{
            val intent = Intent(this, homepage1::class.java)
            startActivity(intent)
        }

        weekImageButton9?.setOnClickListener {
            val intent = Intent(this,sixWeekCouses::class.java)
            startActivity(intent)
        }
        monthImageButton9?.setOnClickListener{
            val intent = Intent(this, sixMonthCourses::class.java)
            startActivity(intent)
        }

        calculateButton9?.setOnClickListener {
            val intent = Intent(this, calculateFees::class.java)
            startActivity(intent)
        }


    }
}