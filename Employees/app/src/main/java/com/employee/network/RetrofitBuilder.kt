package com.employee.network


import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*


object RetrofitBuilder {
    private val retrofit by lazy {

        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        val client: OkHttpClient = OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build()
        Retrofit.Builder()
                .baseUrl("http://dummy.restapiexample.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
    }


    val api: Api by lazy {
        retrofit.create(Api::class.java)
    }
}