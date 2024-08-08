package com.example.mohammedsaad_comp304lab2_ex2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class VRActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vr)  // Ensure the layout name matches exactly

        val textViewVR = findViewById<TextView>(R.id.textViewVR)
        textViewVR.append("\nonCreate executed")
    }

    override fun onStart() {
        super.onStart()
        val textViewVR = findViewById<TextView>(R.id.textViewVR)
        textViewVR.append("\nonStart executed")
    }

    override fun onStop() {
        super.onStop()
        val textViewVR = findViewById<TextView>(R.id.textViewVR)
        textViewVR.append("\nonStop executed")
    }

    override fun onDestroy() {
        super.onDestroy()
        val textViewVR = findViewById<TextView>(R.id.textViewVR)
        textViewVR.append("\nonDestroy executed")
    }
}
