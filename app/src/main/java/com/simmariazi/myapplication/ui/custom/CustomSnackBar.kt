package com.simmariazi.myapplication.ui.custom

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import com.simmariazi.myapplication.R
import com.simmariazi.myapplication.databinding.CustomSnackbarBinding

class CustomSnackBar(view: View, private val message:String) {
    companion object{
        fun make(view:View, message:String) = CustomSnackBar(view, message);
    }

    private val context:Context = view.context;
    private val snackBar = Snackbar.make(view, "", Snackbar.LENGTH_SHORT);
    private val snackBarLayout = snackBar.view as Snackbar.SnackbarLayout;

    private val layoutInflater = LayoutInflater.from(context);
    private val snackbarBinding = CustomSnackbarBinding.inflate(layoutInflater, null, false)

    init{
        initView();
        initData();
    }

    private fun initView(){
        snackBarLayout.removeAllViews();
        snackBarLayout.setPadding(150, 0, 150, 250);
        snackBarLayout.setBackgroundColor(ContextCompat.getColor(context, android.R.color.transparent));
        snackBarLayout.addView(snackbarBinding.root, 0);
    }

    private fun initData(){
        snackbarBinding.txtMessage.setText(message);
    }

    fun show(){
        snackBar.show();
    }
}