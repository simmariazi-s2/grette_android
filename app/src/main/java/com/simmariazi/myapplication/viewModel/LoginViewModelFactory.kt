package com.simmariazi.myapplication.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.simmariazi.myapplication.webservice.LoginService

class LoginViewModelFactory(private val loginService: LoginService) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(LoginService::class.java).newInstance(loginService);
    }
}