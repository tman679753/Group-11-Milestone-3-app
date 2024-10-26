package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class sixWeekCouses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_week_couses)


        val imageButton2 = findViewById<ImageButton>(R.id.imageButton2)
        val imageButton = findViewById<ImageButton>(R.id.imageButton)
        val imageButton3 = findViewById<ImageButton>(R.id.imageButton3)
        val homeImageButton2 = findViewById<ImageButton>(R.id.homeImageButton2)
        val weekImageButton2 = findViewById<ImageButton>(R.id.weekImageButton2)
        val monthImageButton2 = findViewById<ImageButton>(R.id.monthImageButton2)
        val calculateButton2 = findViewById<ImageButton>(R.id.calculateButton2)


        imageButton2?.setOnClickListener{
            val intent = Intent(this,childMinding::class.java)
            startActivity(intent)
        }

        imageButton?.setOnClickListener{
            val intent = Intent(this,cooking::class.java)
            startActivity(intent)
        }

        imageButton3?.setOnClickListener {
            val intent = Intent(this, gardenMaintenance::class.java)
            startActivity(intent)
        }

        homeImageButton2?.setOnClickListener{
            val intent = Intent(this, homepage1::class.java)
            startActivity(intent)
        }

        monthImageButton2?.setOnClickListener{
            val intent = Intent(this,sixMonthCourses::class.java)
            startActivity(intent)
        }

        calculateButton2?.setOnClickListener {
            val intent = Intent(this,calculateFees::class.java)
            startActivity(intent)
        }


    }
}