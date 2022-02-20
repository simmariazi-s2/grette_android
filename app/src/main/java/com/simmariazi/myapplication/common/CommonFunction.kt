package com.simmariazi.myapplication.common

import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.simmariazi.myapplication.ui.custom.CustomSnackBar

class CommonFunction {

    val SUCCESS = 0;
    val WARNING = 1;

    fun printSnackBar(layout:LinearLayout, message:String, type:Int){
        CustomSnackBar.make(layout, message, type).show();
    }

    fun printSnackBar(layout:ConstraintLayout, message:String, type:Int){
        CustomSnackBar.make(layout, message, type).show();
    }

    fun printSnackBar(layout:FrameLayout, message:String, type:Int){
        CustomSnackBar.make(layout, message, type).show();
    }
}