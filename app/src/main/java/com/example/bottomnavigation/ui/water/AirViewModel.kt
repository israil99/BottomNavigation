package com.example.bottomnavigation.ui.water

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AirViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Воздух — это стихия пространства и умственной активности." +
                " Носителей этой стихии можно легко узнать по крайней впечатлительности," +
                " склонности к переменам, высокому, менталитету, граничащему с гениальностью."
    }
    val text: LiveData<String> = _text
}