package com.employee.repositry

import android.util.Log
import com.employee.dashboard.DashBoardModel
import com.employee.network.RetrofitBuilder
import com.employee.network.SafeApiRequest

class ApiReposiotry: SafeApiRequest(){
    suspend fun getEmployees(): DashBoardModel{
        return apiRequest{ RetrofitBuilder.api.getEmployees() }
    }


}