package com.example.mohammedsaad_comp304lab2_ex2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DisplayFragment : Fragment() {

    private lateinit var textView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_display, container, false)
        textView = view.findViewById(R.id.textView)

        val info = arguments?.getString("onCreate")
        textView.text = info

        return view
    }

    override fun onStart() {
        super.onStart()
        textView.append("\nonStart of DisplayFragment executed")
    }
}
