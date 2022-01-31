package com.simmariazi.myapplication.common

import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.simmariazi.myapplication.ui.custom.CustomSnackBar

class CommonFunction {
    fun printSnackBar(layout:LinearLayout, message:String){
        CustomSnackBar.make(layout, message).show();
    }

    fun printSnackBar(layout:ConstraintLayout, message:String){
        CustomSnackBar.make(layout, message).show();
    }

    fun printSnackBar(layout:FrameLayout, message:String){
        CustomSnackBar.make(layout, message).show();
    }
}