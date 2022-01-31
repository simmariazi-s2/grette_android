package com.simmariazi.myapplication.common

import android.app.Application

class StartApplication : Application(){
    companion object{

        // 공용 함수 클래스 변수
        lateinit var common:CommonFunction;

    }

    override fun onCreate() {
        super.onCreate()

        common = CommonFunction();
    }
}