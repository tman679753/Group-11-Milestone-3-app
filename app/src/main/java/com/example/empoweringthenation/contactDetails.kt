package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class contactDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)

        val homeImageButton10 = findViewById<ImageButton>(R.id.homeImageButton10)
        val weekImageButton10 = findViewById<ImageButton>(R.id.weekImageButton10)
        val monthImageButton10 = findViewById<ImageButton>(R.id.monthImageButton10)
        val calculateButton10 = findViewById<ImageButton>(R.id.calculateButton10)

        homeImageButton10?.setOnClickListener{
            val intent = Intent(this, homepage1::class.java)
            startActivity(intent)
        }

        weekImageButton10?.setOnClickListener {
            val intent = Intent(this,sixWeekCouses::class.java)
            startActivity(intent)
        }
        monthImageButton10?.setOnClickListener{
            val intent = Intent(this, sixMonthCourses::class.java)
            startActivity(intent)
        }

        calculateButton10?.setOnClickListener {
            val intent = Intent(this, calculateFees::class.java)
            startActivity(intent)
        }

    }
}