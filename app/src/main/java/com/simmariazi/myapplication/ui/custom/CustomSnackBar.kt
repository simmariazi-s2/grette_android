package com.simmariazi.myapplication.ui.custom

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import com.simmariazi.myapplication.R
import com.simmariazi.myapplication.common.CommonFunction
import com.simmariazi.myapplication.databinding.CustomSnackbarBinding
import com.simmariazi.myapplication.databinding.CustomWarningSnackbarBinding

class CustomSnackBar(view: View, private val message:String, private val type:Int) {
    companion object{
        fun make(view:View, message:String, type:Int) = CustomSnackBar(view, message, type);
    }



    private val context:Context = view.context;
    private val snackBar = Snackbar.make(view, "", Snackbar.LENGTH_SHORT);
    private val snackBarLayout = snackBar.view as Snackbar.SnackbarLayout;

    private val layoutInflater = LayoutInflater.from(context);

    private val successSnackbarBinding = CustomSnackbarBinding.inflate(layoutInflater, null, false);
    private val warningSnackBinding = CustomWarningSnackbarBinding.inflate(layoutInflater, null, false);

    init{
        initView();
        initData();
    }

    private fun initView(){

        snackBarLayout.removeAllViews();
        snackBarLayout.setPadding(150, 0, 150, 250);
        snackBarLayout.setBackgroundColor(ContextCompat.getColor(context, android.R.color.transparent));

        when(type){
            CommonFunction().SUCCESS->{
                snackBarLayout.addView(successSnackbarBinding.root, 0);
            }
            else->{
                snackBarLayout.addView(warningSnackBinding.root, 0);
            }
        }


    }

    private fun initData(){
        when(type){
            CommonFunction().SUCCESS->{
                successSnackbarBinding.txtMessage.setText(message);
            }
            else->{
                warningSnackBinding.txtMessage.setText(message);
            }
        }

    }

    fun show(){
        snackBar.show();
    }
}