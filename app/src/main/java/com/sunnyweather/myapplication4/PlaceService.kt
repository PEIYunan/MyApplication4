package com.sunnyweather.myapplication4

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query



interface PlaceService {
    @GET("v2/place?token=${WeatherApplication.Token}&lang=zh_CN")
    fun searchPlaces(@Query("query")query: String):Call<PlaceResponse>
}