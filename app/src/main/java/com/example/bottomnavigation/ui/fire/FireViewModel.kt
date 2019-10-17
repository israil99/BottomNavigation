package com.example.bottomnavigation.ui.fire

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FireViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Культ Огня существовал с самого начала времен. " +
                "Ему придавалось большое значение, ему поклонялись многие народы Европы, Азии, Америки. " +
                "Это был не просто культ, а еще и стремление проникнуть в суть мироздания. " +
                "Не случайно богу Огня посвящено огромное количество гимнов в древнеиндийских Ведах. "
    }
    val text: LiveData<String> = _text
}