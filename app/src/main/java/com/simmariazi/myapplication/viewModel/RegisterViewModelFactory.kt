package com.simmariazi.myapplication.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.simmariazi.myapplication.webservice.LoginService
import com.simmariazi.myapplication.webservice.RegisterService

class RegisterViewModelFactory(private val userRegister: RegisterService) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(RegisterService::class.java).newInstance(userRegister);
    }
}