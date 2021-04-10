package com.employee.network

import com.employee.dashboard.DashBoardModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface Api {
    @GET("v1/employees")
    suspend fun getEmployees(): Response<DashBoardModel>
}

