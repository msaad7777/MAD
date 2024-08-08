package com.mohammed.nurseapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.mohammed.nurseapp.R

class LoginActivity : AppCompatActivity() {
    private lateinit var nurseIdEditText: EditText
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        nurseIdEditText = findViewById(R.id.nurseIdEditText)
        passwordEditText = findViewById(R.id.passwordEditText)

        findViewById<Button>(R.id.loginButton).setOnClickListener {
            // Handle login logic
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
