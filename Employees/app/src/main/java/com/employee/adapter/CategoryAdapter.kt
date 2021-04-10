package com.employee.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.employee.R
import com.employee.dashboard.DashBoardModel

class CategoryAdapter(val context: Context, val dashBoardModel: DashBoardModel) :
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.txtTitle?.text = "Employee Name : " + dashBoardModel.data?.get(position)?.employeeName
        holder?.tvSalary?.text = "Employee Salary : " + dashBoardModel.data?.get(position)?.employeeSalary
        holder?.tvAge?.text = "Employee Age : " + dashBoardModel.data?.get(position)?.employeeAge
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
        return dashBoardModel.data?.size!!
    }

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
}




