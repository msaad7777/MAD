package com.mohammed.mohammedsaad_comp304lab4_ex1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var landmarkTypesRecyclerView: RecyclerView
    private lateinit var landmarkTypeAdapter: LandmarkTypeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        landmarkTypesRecyclerView = findViewById(R.id.landmarkTypesRecyclerView)
        landmarkTypesRecyclerView.layoutManager = LinearLayoutManager(this)

        val landmarkTypes = getLandmarkTypes()
        landmarkTypeAdapter = LandmarkTypeAdapter(landmarkTypes, this)
        landmarkTypesRecyclerView.adapter = landmarkTypeAdapter
    }

    private fun getLandmarkTypes(): List<LandmarkType> {
        val oldBuildings = listOf(
            Landmark("Casa Loma", "1 Austin Terrace, Toronto, ON M5R 1X8", 43.6780, -79.4094),
            Landmark("Old City Hall", "60 Queen St W, Toronto, ON M5H 2M3", 43.6526, -79.3815)
        )

        val museums = listOf(
            Landmark("Royal Ontario Museum", "100 Queens Park, Toronto, ON M5S 2C6", 43.6677, -79.3948),
            Landmark("Aga Khan Museum", "77 Wynford Dr, Toronto, ON M3C 1K1", 43.7257, -79.3343)
        )

        val attractions = listOf(
            Landmark("CN Tower", "290 Bremner Blvd, Toronto, ON M5V 3L9", 43.6426, -79.3871),
            Landmark("Ripley's Aquarium of Canada", "288 Bremner Blvd, Toronto, ON M5V 3L9", 43.6424, -79.3860)
        )

        return listOf(
            LandmarkType("Old Buildings", oldBuildings),
            LandmarkType("Museums", museums),
            LandmarkType("Attractions", attractions)
        )
    }
}
