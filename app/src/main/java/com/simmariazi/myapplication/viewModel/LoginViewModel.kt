package com.simmariazi.myapplication.viewModel

import android.telecom.Call
import androidx.lifecycle.ViewModel
import com.simmariazi.myapplication.model.LoginModel
import com.simmariazi.myapplication.webservice.LoginService
import retrofit2.Callback
import retrofit2.Response

class LoginViewModel(userLogin:LoginService) : ViewModel() {
    private val _userLogin = userLogin;
    fun requestUserLogin(id:String, password:String){
        //.. retorift servcice method call
        _userLogin.webClient.userLogin(id, password).enqueue(object : Callback<LoginModel>{
            override fun onFailure(call: retrofit2.Call<LoginModel>, t: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onResponse(
                call: retrofit2.Call<LoginModel>,
                response: Response<LoginModel>
            ) {
                TODO("Not yet implemented")
            }
        })
    }
}