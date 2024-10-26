package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class firstAid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid)

    val homeImageButton3 = findViewById<ImageButton>(R.id.homeImageButton3)
    val weekImageButton3 = findViewById<ImageButton>(R.id.weekImageButton3)
    val monthImageButton3 = findViewById<ImageButton>(R.id.monthImageButton3)
    val calculateButton3 = findViewById<ImageButton>(R.id.calculateButton3)

    homeImageButton3?.setOnClickListener{
        val intent = Intent(this, homepage1::class.java)
        startActivity(intent)
    }

    weekImageButton3?.setOnClickListener {
        val intent =Intent(this,sixWeekCouses::class.java)
        startActivity(intent)
    }
    monthImageButton3?.setOnClickListener{
        val intent = Intent(this, sixMonthCourses::class.java)
        startActivity(intent)
    }

    calculateButton3?.setOnClickListener {
        val intent = Intent(this, calculateFees::class.java)
        startActivity(intent)
    }

    }

}