// Student Number - 301313784
package com.mohammed.saad

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SaadActivity : AppCompatActivity() {
    private lateinit var checkBox1: CheckBox
    private lateinit var checkBox2: CheckBox
    private lateinit var checkBox3: CheckBox
    private lateinit var checkBox4: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saad)

        checkBox1 = findViewById(R.id.checkBox1)
        checkBox2 = findViewById(R.id.checkBox2)
        checkBox3 = findViewById(R.id.checkBox3)
        checkBox4 = findViewById(R.id.checkBox4)

        findViewById<Button>(R.id.nextButton).setOnClickListener {
            val selectedExercises = StringBuilder("Selected exercises:\n")
            if (checkBox1.isChecked) {
                selectedExercises.append(getString(R.string.lose_things)).append("\n")
            }
            if (checkBox2.isChecked) {
                selectedExercises.append(getString(R.string.remember_names)).append("\n")
            }
            if (checkBox3.isChecked) {
                selectedExercises.append(getString(R.string.learn_things_quickly)).append("\n")
            }
            if (checkBox4.isChecked) {
                selectedExercises.append(getString(R.string.keep_track_of_multiple_things)).append("\n")
            }
            Toast.makeText(this, selectedExercises.toString(), Toast.LENGTH_LONG).show()
        }
    }
}
