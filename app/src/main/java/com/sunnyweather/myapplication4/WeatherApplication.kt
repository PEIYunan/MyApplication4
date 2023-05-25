package com.sunnyweather.myapplication4

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.media.session.MediaSession.Token

class WeatherApplication:Application() {
    companion object{
        const val Token="O3qX6QVlYjkyPFGU"
    @SuppressLint("StaticFieldLeak")
    lateinit var context:Context
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}