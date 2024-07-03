// Student Number - 301313784
package com.mohammed.saad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MohammedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mohammed)

        val selectExerciseButton: Button = findViewById(R.id.imageButton)
        selectExerciseButton.setOnClickListener {
            val intent = Intent(this, SaadActivity::class.java)
            startActivity(intent)
        }
    }
}
