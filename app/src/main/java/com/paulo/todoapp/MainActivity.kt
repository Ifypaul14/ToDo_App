package com.paulo.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    val username: String = "Admin"
    val password: String = "Admin"
    private lateinit var username = EditText
    private lateinit var password = EditText
    private lateinit var botten = EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}