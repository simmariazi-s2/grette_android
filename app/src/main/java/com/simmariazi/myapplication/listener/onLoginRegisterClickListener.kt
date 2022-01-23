package com.simmariazi.myapplication.listener

import android.view.View
import androidx.navigation.Navigation
import com.simmariazi.myapplication.R

class onLoginRegisterClickListener() : View.OnClickListener {
    override fun onClick(v: View?) {
        val controller = Navigation.findNavController(v!!)
        controller.navigate(R.id.action_loginFragment_to_emailVerifyFragment2)
    }
}