package com.employee

import SingleLiveEvent
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import mvvm.f4wzy.com.samplelogin.util.CustomeProgressDialog

open class BaseFragment : Fragment() {
    var customeProgressDialog: CustomeProgressDialog? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        customeProgressDialog = CustomeProgressDialog(requireActivity())

    }

}