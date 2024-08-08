package com.example.mohammedsaad_comp304lab2_ex2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AIActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ai)  // Ensure the layout name matches exactly

        val textViewAI = findViewById<TextView>(R.id.textViewAI)
        textViewAI.append("\nonCreate executed")
    }

    override fun onStart() {
        super.onStart()
        val textViewAI = findViewById<TextView>(R.id.textViewAI)
        textViewAI.append("\nonStart executed")
    }

    override fun onStop() {
        super.onStop()
        val textViewAI = findViewById<TextView>(R.id.textViewAI)
        textViewAI.append("\nonStop executed")
    }

    override fun onDestroy() {
        super.onDestroy()
        val textViewAI = findViewById<TextView>(R.id.textViewAI)
        textViewAI.append("\nonDestroy executed")
    }
}
