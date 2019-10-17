package com.example.bottomnavigation.ui.earth

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer

import com.example.bottomnavigation.R

class EarthFragment : Fragment() {

    private lateinit var earthViewModel: EarthViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        earthViewModel =
            ViewModelProviders.of(this).get(EarthViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_earth, container, false)
        val textView: TextView = root.findViewById(R.id.text_earth)
        earthViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}
