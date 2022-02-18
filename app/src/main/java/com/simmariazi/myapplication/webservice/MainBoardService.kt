package com.simmariazi.myapplication.webservice

class MainBoardService {
    private val BASE_URL = "http://www.naver.com";

    val WebClient = BaseService().getWebClient(BASE_URL).create(MainBoardInterface::class.java);

}

interface MainBoardInterface{
    // @GET, @POST...
}