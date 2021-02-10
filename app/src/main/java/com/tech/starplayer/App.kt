package com.tech.starplayer

import android.app.Application
import com.tech.starplayer.di.components.AppComponent
import com.tech.starplayer.di.components.DaggerAppComponent


class App  :Application() {
    lateinit var appComponent : AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().application(this).build()
    }
}