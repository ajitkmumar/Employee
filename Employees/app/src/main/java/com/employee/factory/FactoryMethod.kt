package com.employee.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.employee.repositry.ApiReposiotry
import com.employee.ui.home.DashBoardViewModel
import java.lang.Exception

class FactoryMethod(private val apiReposiotry: ApiReposiotry) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DashBoardViewModel::class.java)) {
            return DashBoardViewModel(apiReposiotry) as T
        }
        throw Exception("Unknown class name")
    }

}