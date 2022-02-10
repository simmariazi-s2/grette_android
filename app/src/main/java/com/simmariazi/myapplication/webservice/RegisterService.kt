package com.simmariazi.myapplication.webservice

import com.simmariazi.myapplication.model.LoginModel
import com.simmariazi.myapplication.model.RegisterModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


class RegisterService{
    private val BASE_URL = "http://www.naver.com";
    //URL 물어보
    val webClient = BaseService().getWebClient(BASE_URL).create(RegisterInterface::class.java);
}

// 회원가 정보를 백엔드로 전달
interface RegisterInterface {
    @GET("devices/{loginId}/{loginPwd}/{loginNick}/{loginCompany}")
    //파라미터 확인필
    fun userRegister(
        @Path("loginId", encoded = true) loginId: String,
        @Path("loginPwd", encoded = true) loginPwd: String,
        @Path("loginNick", encoded = true) loginNick: String,
        @Path("loginCompany", encoded = true) loginCompany: String


        //이름은 @Get 으로 불러오는 이름과 동일(물어보기)
    ): Call<RegisterModel>

    /// ... etc
}