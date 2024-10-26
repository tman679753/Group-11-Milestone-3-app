package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView


class calculateFees : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_fees)


        val homeImageButton11 = findViewById<ImageButton>(R.id.homeImageButton11)
        val weekImageButton11 = findViewById<ImageButton>(R.id.weekImageButton11)
        val monthImageButton11 = findViewById<ImageButton>(R.id.monthImageButton11)



        monthImageButton11?.setOnClickListener{

            val intent = Intent(this,sixMonthCourses::class.java)
            startActivity(intent)
        }

        weekImageButton11?.setOnClickListener{
            val intent = Intent(this,sixWeekCouses::class.java)
            startActivity(intent)
        }
        homeImageButton11?.setOnClickListener{
            val intent = Intent(this, homepage1::class.java)
            startActivity(intent)
        }


        // Define fees for each course
        val courseFees = mapOf(
            R.id.checkbox_garden_maintenance to 750,
            R.id.checkbox_cooking to 750,
            R.id.checkbox_child_minding to 750,
            R.id.checkbox_life_skills to 1500,
            R.id.checkbox_landscaping to 1500,
            R.id.checkbox_sewing to 1500,
            R.id.checkbox_first_aid to 1500
        )

        val discountRate = 0.1  // Example discount: 10%
        val vatRate = 0.15

// Calculate the total fee when "Calculate" button is clicked
        findViewById<Button>(R.id.button).setOnClickListener {
            var totalFee = 0.0
            var selectedCoursesCount = 0


            // Loop through each course checkbox and add the fee if checked
            for ((checkboxId, fee) in courseFees) {
                val checkBox = findViewById<CheckBox>(checkboxId)
                if (checkBox.isChecked) {
                    totalFee += fee
                    selectedCoursesCount++
                }
            }

            // Determine the discount rate based on the number of selected courses
            val discountRate = when (selectedCoursesCount) {
                1 -> 0.0      // No discount for one course
                2 -> 0.05     // 5% discount for two courses
                3 -> 0.10     // 10% discount for three courses
                else -> 0.15  // 15% discount for more than three courses
            }

            // Apply the discount to the total fee
            totalFee -= totalFee * discountRate



            // Apply VAT
            totalFee += totalFee * vatRate

            // Display the calculated total fee
            findViewById<TextView>(R.id.totalFeeText).text = "Total Fee: R${"%.2f".format(totalFee)}"
        }



    }
}