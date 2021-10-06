package com.example.myapplication.Model

import com.google.gson.annotations.SerializedName

data class Ecomrece (

        @SerializedName("status") val status : Int,
        @SerializedName("msg") val msg : String,
        @SerializedName("data") val data : ArrayList<Data>
)