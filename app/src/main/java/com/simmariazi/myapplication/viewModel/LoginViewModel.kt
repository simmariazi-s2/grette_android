package com.simmariazi.myapplication.viewModel

import android.telecom.Call
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.simmariazi.myapplication.model.LoginModel
import com.simmariazi.myapplication.webservice.LoginService
import retrofit2.Callback
import retrofit2.Response

class LoginViewModel(userLogin:LoginService) : ViewModel() {
    private val _userLogin = userLogin;
    private val id = ObservableField<String>();
    private val password = ObservableField<String>();
    fun requestUserLogin(){
        //.. retorift servcice method call
        _userLogin.webClient.userLogin(id.get().toString(), password.get().toString()).enqueue(object : Callback<LoginModel>{
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