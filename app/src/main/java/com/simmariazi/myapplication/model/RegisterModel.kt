package com.simmariazi.myapplication.model

import com.google.gson.annotations.SerializedName
import com.simmariazi.myapplication.ui.register.Nickname


class RegisterModel(
    @SerializedName("name")
    val userName: String = "이름",
    @SerializedName("company")
    val userCompany: String = "회사",
    @SerializedName("nickname")
    val userNickname: String = "닉네임",

)