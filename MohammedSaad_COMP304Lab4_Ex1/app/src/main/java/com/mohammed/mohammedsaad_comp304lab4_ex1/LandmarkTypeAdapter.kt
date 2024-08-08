package com.mohammed.mohammedsaad_comp304lab4_ex1

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LandmarkTypeAdapter(private val landmarkTypes: List<LandmarkType>, private val context: Context) :
    RecyclerView.Adapter<LandmarkTypeAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val landmarkTypeName: TextView = itemView.findViewById(R.id.landmarkTypeName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_landmark_type, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val landmarkType = landmarkTypes[position]
        holder.landmarkTypeName.text = landmarkType.name
        holder.itemView.setOnClickListener {
            val intent = Intent(context, LandmarksActivity::class.java).apply {
                putExtra("landmarkType", landmarkType)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = landmarkTypes.size
}
