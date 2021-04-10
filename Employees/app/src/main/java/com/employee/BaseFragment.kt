package com.employee

import android.os.Bundle
import androidx.fragment.app.Fragment
import mvvm.f4wzy.com.samplelogin.util.CustomeProgressDialog

open class BaseFragment : Fragment() {

    var customeProgressDialog: CustomeProgressDialog? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        customeProgressDialog = CustomeProgressDialog(requireActivity())
    }

}