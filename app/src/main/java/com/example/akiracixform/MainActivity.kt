package com.example.akiracixform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button:Button
    lateinit var button2:Button
    lateinit var etEmail: TextView
    lateinit var etPassword: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.button)
        button2=findViewById(R.id.button2)
        etPassword=findViewById(R.id.etPassword)
        etEmail=findViewById(R.id.etEmail)
        button2.setOnClickListener {
            val intent=Intent(baseContext, SignUp::class.java)
            startActivity(intent)
        }
        button.setOnClickListener {
            Toast.makeText(baseContext, "Welcome to Janet's Application", Toast.LENGTH_LONG).show()

        }
    }
}