package com.example.mohammedsaad_comp304lab2_ex2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), ListFragment.OnItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val args = Bundle()
        args.putString("onCreate", "onCreate of MainActivity executed")


        val displayFragment = DisplayFragment()
        displayFragment.arguments = args


        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_display, displayFragment)
            .commit()
    }


    override fun onItemSelected(position: Int) {
        val intent = when (position) {
            0 -> Intent(this, AIActivity::class.java)
            1 -> Intent(this, VRActivity::class.java)
            else -> return
        }
        startActivity(intent)
    }
}
