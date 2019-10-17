package com.example.bottomnavigation.ui.air

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.bottomnavigation.R

class WaterFragment : Fragment() {

    private lateinit var waterViewModel: WaterViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        waterViewModel =
            ViewModelProviders.of(this).get(WaterViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_water, container, false)
        val textView: TextView = root.findViewById(R.id.text_water)
        waterViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}