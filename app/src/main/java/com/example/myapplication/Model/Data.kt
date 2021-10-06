package com.example.myapplication.Model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
@Parcelize
data class Data (

        @SerializedName("id") val id : Int,
        @SerializedName("brandname") val brandname : String,
        @SerializedName("price") val price : Int,
        @SerializedName("description") val description : String,
        @SerializedName("image") val image : String,
        @SerializedName("img1") val img1 : String,
        @SerializedName("img2") val img2 : String,
        @SerializedName("img3") val img3 : String,
        @SerializedName("img4") val img4 : String
):Parcelable