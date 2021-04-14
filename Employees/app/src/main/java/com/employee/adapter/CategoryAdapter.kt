package com.employee.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.employee.R
import com.employee.dashboard.DashBoardModel
import org.json.JSONObject


class CategoryAdapter(val context: Context, val dashBoardModel: List<DashBoardModel>) :
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val jresponse = JSONObject(dashBoardModel[position].getQuery())
        val getPoiId = jresponse.getString("poiId")
        val type = jresponse.getString("type")

        holder?.txtTitle?.text = "$getPoiId"
        holder?.tvSalary?.text = "$type"

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.employee_list, p0, false)
        return ViewHolder(v);
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtTitle = itemView.findViewById<TextView>(R.id.tvName)
        val tvSalary = itemView.findViewById<TextView>(R.id.tvSalary)
        val tvAge = itemView.findViewById<TextView>(R.id.tvAge)

    }

    override fun getItemCount(): Int {
        return dashBoardModel?.size!!
    }

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
}




