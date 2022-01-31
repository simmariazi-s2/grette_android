package com.simmariazi.myapplication.listener.register

import android.view.View
import androidx.navigation.Navigation
import com.simmariazi.myapplication.R

class OnEmailNextClickListener : View.OnClickListener {
    override fun onClick(v: View?) {
        val controller = Navigation.findNavController(v!!)
     //   controller.navigate(R.id.action_emailVerifyFragment_to_passwordFragment)
    }
}