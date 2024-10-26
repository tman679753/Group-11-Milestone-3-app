package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class sewing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sewing)

        val homeImageButton4 = findViewById<ImageButton>(R.id.homeImageButton4)
        val weekImageButton4 = findViewById<ImageButton>(R.id.weekImageButton4)
        val monthImageButton4 = findViewById<ImageButton>(R.id.monthImageButton4)
        val calculateButton4 = findViewById<ImageButton>(R.id.calculateButton4)

        homeImageButton4?.setOnClickListener{
            val intent = Intent(this, homepage1::class.java)
            startActivity(intent)
        }

        weekImageButton4?.setOnClickListener {
            val intent = Intent(this,sixWeekCouses::class.java)
            startActivity(intent)
        }
        monthImageButton4?.setOnClickListener{
            val intent = Intent(this, sixMonthCourses::class.java)
            startActivity(intent)
        }


        calculateButton4?.setOnClickListener {
            val intent = Intent(this, calculateFees::class.java)

            startActivity(intent)
        }





    }
}