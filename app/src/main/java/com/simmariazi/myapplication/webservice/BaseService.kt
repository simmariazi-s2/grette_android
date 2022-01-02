package com.simmariazi.myapplication.webservice

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// Retrofit2 BASE Service 클래스
// retrofit2 객체 공용으로 사용하기 위함.
class BaseService {
    fun getWebClient(baseURL:String) : Retrofit{
        return Retrofit.Builder().baseUrl(baseURL).addConverterFactory(GsonConverterFactory.create()).build();
    }
}