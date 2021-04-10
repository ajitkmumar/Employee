package com.employee.network


import SingleLiveEvent
import android.util.Log
import retrofit2.Response

abstract class SafeApiRequest(){
    var progressDialog: SingleLiveEvent<Boolean> = SingleLiveEvent<Boolean>()
    suspend fun <T : Any> apiRequest(call: suspend () -> Response<T>): T {
        progressDialog.value = true
        val response = call.invoke()
        if (response?.isSuccessful) {
            progressDialog.value = false
            return response?.body()!!
        } else {
            progressDialog.value = false
            Log.e("ERROR_BODY", ""+response.code());
        }
        throw RuntimeException("RuntimeException in coroutine")
    }


}

