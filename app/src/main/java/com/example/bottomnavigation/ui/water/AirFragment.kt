package com.example.bottomnavigation.ui.water

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.bottomnavigation.R

class AirFragment : Fragment() {

    private lateinit var airViewModel: AirViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        airViewModel =
            ViewModelProviders.of(this).get(AirViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_air, container, false)
        val textView: TextView = root.findViewById(R.id.text_air)
        airViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}