package com.tech.starplayer.di.components

import android.app.Application
import com.tech.starplayer.api.WebServiceApi
import com.tech.starplayer.di.modules.EndPointModule
import com.tech.starplayer.di.modules.NetworkModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = [NetworkModule::class, EndPointModule::class])
@Singleton
interface AppComponent {

    fun provideApplication(): Application
    fun provideWebserviceApi(): WebServiceApi

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}