package com.mohammed.mohammedsaad_comp304lab4_ex1

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LandmarkAdapter(private val landmarks: List<Landmark>, private val context: Context) :
    RecyclerView.Adapter<LandmarkAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val landmarkName: TextView = itemView.findViewById(R.id.landmarkName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_landmark, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val landmark = landmarks[position]
        holder.landmarkName.text = landmark.name
        holder.itemView.setOnClickListener {
            val intent = Intent(context, LandmarkMapActivity::class.java).apply {
                putExtra("landmark", landmark)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = landmarks.size
}
