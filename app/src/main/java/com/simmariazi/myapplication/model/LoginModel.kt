package com.simmariazi.myapplication.model

import com.google.gson.annotations.SerializedName

// example
class LoginModel(
    @SerializedName("name")
    val userName: String = "이름",
    @SerializedName("company")
    val userCompany: String = "회사",
)