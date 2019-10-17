package com.example.bottomnavigation.ui.earth

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EarthViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Стихия Земля обозначается треугольником, обращенным острием вниз. " +
                "Эта стихия придает конкретность, устойчивость, неизменность, четкость, прочность. " +
                "Обладает формой, законченностью, жесткостью, стабильностью, структурой."
    }
    val text: LiveData<String> = _text
}
