package com.example.bottomnavigation.ui.fire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.bottomnavigation.R

class FireFragment : Fragment() {

    private lateinit var fireViewModel: FireViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fireViewModel =
            ViewModelProviders.of(this).get(FireViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_fire, container, false)
        val textView: TextView = root.findViewById(R.id.text_fire)
        fireViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}