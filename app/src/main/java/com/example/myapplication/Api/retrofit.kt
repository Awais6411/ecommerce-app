package com.example.myapplication.Api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class retrofit {

    companion object{
        var baseurl="http://10.0.2.2/ecomrece/"
        var retrofit:Retrofit?=null

    fun getObject():Retrofit{

        if (retrofit==null){
            retrofit=Retrofit.Builder().baseUrl(baseurl).addConverterFactory(GsonConverterFactory.create()).build()
        }

        return retrofit!!
    }


    }

}