package com.example.bottomnavigation.ui.air

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WaterViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "По представлениям Платона, символом воды являлся икосаэдр." +
                " Согласно Аристотелю, вода представляла собой одно из состояний единой первоматерии, а именно — влажность."

    }
    val text: LiveData<String> = _text
}