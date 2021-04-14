package com.employee.ui.home

import SingleLiveEvent
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.employee.dashboard.DashBoardModel
import com.employee.repositry.ApiReposiotry
import kotlinx.coroutines.launch

class DashBoardViewModel(private val apiReposiotry: ApiReposiotry) : ViewModel() {
    val apiResponse: MutableLiveData<List<DashBoardModel>> = MutableLiveData()

    fun getEmployees() = viewModelScope.launch {
        try {
            apiResponse.value = apiReposiotry.getEmployees()
        } catch (e: Throwable) {
            e.printStackTrace()
        }

    }



}

