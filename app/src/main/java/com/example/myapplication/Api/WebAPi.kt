package com.example.myapplication.Api

import com.example.myapplication.Model.Data
import com.example.myapplication.Model.Ecomrece
import retrofit2.Call
import retrofit2.http.GET

interface WebAPi {

    @GET("readdata.php")
    fun getData():Call<Ecomrece>
    @GET("readimages.php")
    fun getImages():Call<Ecomrece>

}