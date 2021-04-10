package com.employee.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutUsViewModel : ViewModel() {

    private val about = MutableLiveData<String>().apply {
        value = "About Us Fragment"
    }
    val text: LiveData<String> = about
}