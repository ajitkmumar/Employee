package com.employee.dashboard

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class DashBoardModel {
    @SerializedName("query")
    @Expose
    private var query: String? = null

    fun getQuery(): String? {
        return query
    }

    fun setQuery(query: String?) {
        this.query = query
    }
}