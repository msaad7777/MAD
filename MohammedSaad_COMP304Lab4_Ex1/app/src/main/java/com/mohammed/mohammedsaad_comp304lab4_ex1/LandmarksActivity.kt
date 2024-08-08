package com.mohammed.mohammedsaad_comp304lab4_ex1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LandmarksActivity : AppCompatActivity() {

    private lateinit var landmarksRecyclerView: RecyclerView
    private lateinit var landmarkAdapter: LandmarkAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landmarks)

        val landmarkType = intent.getSerializableExtra("landmarkType") as LandmarkType

        landmarksRecyclerView = findViewById(R.id.landmarksRecyclerView)
        landmarksRecyclerView.layoutManager = LinearLayoutManager(this)
        landmarkAdapter = LandmarkAdapter(landmarkType.landmarks, this)
        landmarksRecyclerView.adapter = landmarkAdapter
    }
}
