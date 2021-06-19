package com.example.akiracixform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.*

class SignUp : AppCompatActivity() {
    lateinit var button3: Button
    lateinit var button4: Button
    lateinit var spinner: Spinner
    lateinit var etName: TextView
    lateinit var etEmail: TextView
    lateinit var etPhone: TextView
    lateinit var etPassword: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        castView()
        buttons()

    }
    fun castView(){
        spinner=findViewById(R.id.spinner)
        etName=findViewById(R.id.etName)
        etEmail=findViewById(R.id.etEmail)
        etPhone=findViewById(R.id.etPhone)
        etPassword=findViewById(R.id.etPassword)
        button3=findViewById(R.id.button3)
        button4=findViewById(R.id.button4)
        val genders= arrayOf("Female", "Male", "other")
        val genderAdapter=ArrayAdapter(this, android.R.layout.simple_spinner_item, genders)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter=genderAdapter
    }
    fun buttons(){
        button4.setOnClickListener {
            val intent=Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            Toast.makeText(baseContext, "Thank you", Toast.LENGTH_LONG).show()
        }
    }

}