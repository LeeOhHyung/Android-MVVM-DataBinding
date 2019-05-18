package com.example.sample

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    // use 2-way binding
    var editTextLiveData = MutableLiveData<String>()
    var textViewLiveData = MutableLiveData<String>()

    fun init(){
    }

    fun buttonClick(v: View){
        textViewLiveData.value = editTextLiveData.value
        editTextLiveData.value = ""
    }
}