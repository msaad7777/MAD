package com.example.mohammedsaad_comp304lab2_ex2

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment

class ListFragment : Fragment() {

    private lateinit var listView: ListView
    private lateinit var listener: OnItemSelectedListener

    interface OnItemSelectedListener {
        fun onItemSelected(position: Int)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as OnItemSelectedListener
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        listView = view.findViewById(R.id.listView)

        val items = arrayOf("AIActivity", "VRActivity")
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, items)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            listener.onItemSelected(position)
        }

        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(activity, "ListFragment onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(activity, "ListFragment onStart", Toast.LENGTH_SHORT).show()
    }
}
