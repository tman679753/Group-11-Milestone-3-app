package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class landscaping : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landscaping)


        val homeImageButton5 = findViewById<ImageButton>(R.id.homeImageButton5)
        val weekImageButton5 = findViewById<ImageButton>(R.id.weekImageButton5)
        val monthImageButton5 = findViewById<ImageButton>(R.id.monthImageButton5)
        val calculateButton5 = findViewById<ImageButton>(R.id.calculateButton5)

        homeImageButton5?.setOnClickListener{
            val intent = Intent(this, homepage1::class.java)
            startActivity(intent)
        }

        weekImageButton5?.setOnClickListener {
            val intent = Intent(this,sixWeekCouses::class.java)
            startActivity(intent)
        }
        monthImageButton5?.setOnClickListener{
            val intent = Intent(this, sixMonthCourses::class.java)
            startActivity(intent)
        }

        calculateButton5?.setOnClickListener {
            val intent = Intent(this, calculateFees::class.java)
            startActivity(intent)
        }











    }
}