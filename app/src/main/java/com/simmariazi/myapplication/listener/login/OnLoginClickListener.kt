package com.simmariazi.myapplication.listener.login

import android.content.Context
import android.content.Intent
import android.view.View
import androidx.fragment.app.FragmentActivity
import com.simmariazi.myapplication.ui.LoginActivity
import com.simmariazi.myapplication.ui.MainActivity

class OnLoginClickListener(private val context: Context, private val activity:LoginActivity): View.OnClickListener {
    override fun onClick(v: View?) {
        val intent = Intent(context, MainActivity::class.java);
        context.startActivity(intent);
        activity.finish();
    }
}