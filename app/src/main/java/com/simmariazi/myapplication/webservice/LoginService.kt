package com.simmariazi.myapplication.webservice

import com.simmariazi.myapplication.model.LoginModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

class LoginService{
    private val BASE_URL = "http://www.naver.com";
    val webClient = BaseService().getWebClient(BASE_URL).create(LoginInterface::class.java);
}

// 아래는 예시의 내용임
// 로그인 정보를 백엔드로 전달 후 로그인 유무 체크
interface LoginInterface {
    @GET("devices/{loginId}/{loginPwd}")
    fun userLogin(
        @Path("loginId", encoded = true) loginId: String,
        @Path("loginPwd", encoded = true) loginPwd: String
    ): Call<LoginModel>

    /// ... etc
}

