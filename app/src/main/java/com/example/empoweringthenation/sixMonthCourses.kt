package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class sixMonthCourses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_month_courses)

    val firstImageButton = findViewById<ImageButton>(R.id.firstImageButton)
        val sewingImageButton = findViewById<ImageButton>(R.id.sewingImageButton)
        val landImageButton = findViewById<ImageButton>(R.id.landImageButton)
        val lifeImageButton = findViewById<ImageButton>(R.id.lifeImageButton)
        val homeImageButton1 = findViewById<ImageButton>(R.id.homeImageButton1)
        val weekImageButton1 = findViewById<ImageButton>(R.id.weekImageButton1)
        val monthImageButton1 = findViewById<ImageButton>(R.id.monthImageButton1)







        firstImageButton?.setOnClickListener{

            val intent = Intent(this,firstAid::class.java)
            startActivity(intent)
        }

        sewingImageButton?.setOnClickListener{

            val intent = Intent(this,sewing::class.java)
            startActivity(intent)
        }
        landImageButton?.setOnClickListener{

            val intent = Intent(this,landscaping::class.java)
            startActivity(intent)
        }
        lifeImageButton?.setOnClickListener{

            val intent = Intent(this,lifeSkills::class.java)
            startActivity(intent)
        }

        homeImageButton1?.setOnClickListener{

            val intent = Intent(this,homepage1::class.java)
            startActivity(intent)
        }

        weekImageButton1?.setOnClickListener{
            val intent = Intent(this,sixWeekCouses::class.java)
            startActivity(intent)
        }


    }
}