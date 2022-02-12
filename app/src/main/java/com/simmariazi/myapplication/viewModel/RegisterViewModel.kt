package com.simmariazi.myapplication.viewModel

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.simmariazi.myapplication.model.LoginModel
import com.simmariazi.myapplication.model.RegisterModel
import com.simmariazi.myapplication.webservice.RegisterService
import retrofit2.Callback
import retrofit2.Response
import java.util.*

data class RegisterViewModel(private val userRegister:RegisterService) : ViewModel(){
    var email: ObservableField<String> = ObservableField("email")
    var password: ObservableField<String> = ObservableField("password")
    var nickname: ObservableField<String> = ObservableField("nickname")
    var company: ObservableField<String> = ObservableField("company")

    private val _userRegister = userRegister;

    fun requestRegister(){
        //.. retorift servcice method call
        _userRegister.webClient.userRegister(email.get().toString(), password.get().toString(), nickname.get().toString(), company.get().toString()).enqueue(object : Callback<RegisterModel> {
            override fun onFailure(call: retrofit2.Call<RegisterModel>, t: Throwable) {
                TODO("Not yet implemented")
                t.message
            }

            override fun onResponse(
                call: retrofit2.Call<RegisterModel>,
                response: Response<RegisterModel>

            //결과에 대한 처리값(200이 왔을 때)

            //회원가입 성공 시 숫자 1과 응답코드가 날아옴
                //로그인 화면으로 연결 (회원가입 액티비티를 종료시킴)
            //실패 시 0과 메시지 내용, 코드값이 날아옴결
             //에러메시지 노출
            ) {
                response.body()
                //1이냐 0이
                response.code()
                //200이냐 400이냐
                TODO("Not yet implemented")
            }
        })
    }
}