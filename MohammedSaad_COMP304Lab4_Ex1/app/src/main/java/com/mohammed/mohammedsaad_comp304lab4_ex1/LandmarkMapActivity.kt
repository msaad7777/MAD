package com.mohammed.mohammedsaad_comp304lab4_ex1

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class LandmarkMapActivity : FragmentActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var landmark: Landmark

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landmark_map)

        landmark = intent.extras?.getParcelable("landmark")!!

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        val location = LatLng(landmark.latitude, landmark.longitude)
        mMap.addMarker(MarkerOptions().position(location).title(landmark.name))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 15f))
    }
}
