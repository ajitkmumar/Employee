package com.employee.dashboard


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.employee.BaseFragment
import com.employee.R
import com.employee.adapter.CategoryAdapter
import com.employee.databinding.DashboardBinding
import com.employee.factory.FactoryMethod
import com.employee.repositry.ApiReposiotry
import com.employee.ui.home.DashBoardViewModel
import com.mynation.`interface`.ClickListener

class DashboardFragment : BaseFragment(), ClickListener {
    private lateinit var binding: DashboardBinding
    private lateinit var viewmodel: DashBoardViewModel
    private val apiReposiotry =  ApiReposiotry()
    private val factory = FactoryMethod(apiReposiotry)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.dashboard, container, false)
        viewmodel = ViewModelProvider(this,factory)[DashBoardViewModel::class.java]

        initBlock()

        return binding.root
    }

    fun initBlock(){



        viewmodel.getEmployees()

        viewmodel.apiResponse.observe(requireActivity(), Observer { response ->
            binding.catogeryRecycel.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
            var adapter = CategoryAdapter(requireActivity(), response)
            binding.catogeryRecycel.adapter = adapter
            binding.tvMsg.visibility = View.GONE
        })
    }

    override fun passResultCallback(errorCode: Int) {
        Log.e("GET_DASH",""+errorCode)
    }


}
