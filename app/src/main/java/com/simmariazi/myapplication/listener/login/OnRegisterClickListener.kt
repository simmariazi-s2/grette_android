package com.simmariazi.myapplication.listener.login

import android.content.Context
import android.content.Intent
import android.view.View
import androidx.navigation.Navigation
import com.simmariazi.myapplication.R
import com.simmariazi.myapplication.ui.RegisterActivity

class OnRegisterClickListener(private val context: Context)  : View.OnClickListener {
    override fun onClick(v: View?) {
        context.startActivity(Intent(context, RegisterActivity::class.java));
    }
}