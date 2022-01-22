package com.simmariazi.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.simmariazi.myapplication.R
import com.simmariazi.myapplication.databinding.ActivityLoginBinding
import com.simmariazi.myapplication.viewModel.LoginViewModel
import com.simmariazi.myapplication.viewModel.LoginViewModelFactory
import com.simmariazi.myapplication.webservice.LoginService

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_login)

        // binding 사용을 위해서는 layout의 최상위 항목을 <layout></layout>으로 변경 필요
        val binding:ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        // 팩토리 패턴으로 LoginService객체생성
//        val loginFactory = LoginViewModelFactory(LoginService());
//        val loginViewModel = ViewModelProvider(this, loginFactory).get(LoginViewModel::class.java);
//
//        loginViewModel.requestUserLogin("test", "1123");
    }
}