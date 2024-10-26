package com.example.empoweringthenation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val nameEdit = findViewById<EditText>(R.id.nameEdit)
    val phoneEdit = findViewById<EditText>(R.id.phoneEdit)
    val emailEdit = findViewById<EditText>(R.id.emailEdit)
    val loginButton = findViewById<Button>(R.id.loginButton)

     loginButton?.setOnClickListener {

      val intent = Intent(this, homepage1::class.java)
        startActivity(intent)
     }



    }
}