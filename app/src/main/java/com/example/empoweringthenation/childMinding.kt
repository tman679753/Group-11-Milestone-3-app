package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class childMinding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_minding)

        val homeImageButton7 = findViewById<ImageButton>(R.id.homeImageButton7)
        val weekImageButton7 = findViewById<ImageButton>(R.id.weekImageButton7)
        val monthImageButton7 = findViewById<ImageButton>(R.id.monthImageButton7)
        val calculateButton7 = findViewById<ImageButton>(R.id.calculateButton7)

        homeImageButton7?.setOnClickListener{
            val intent = Intent(this, homepage1::class.java)
            startActivity(intent)
        }

        weekImageButton7?.setOnClickListener {
            val intent = Intent(this,sixWeekCouses::class.java)
            startActivity(intent)
        }
        monthImageButton7?.setOnClickListener{
            val intent = Intent(this, sixMonthCourses::class.java)

            startActivity(intent)
        }


        calculateButton7?.setOnClickListener {
            val intent = Intent(this, calculateFees::class.java)
            startActivity(intent)
        }



    }
}