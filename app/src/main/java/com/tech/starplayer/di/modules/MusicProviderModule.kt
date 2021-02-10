package com.tech.starplayer.di.modules

import android.app.Application
import com.tech.starplayer.api.WebServiceApi
import com.tech.starplayer.model.LocalMusicProvider
import com.tech.starplayer.model.LocalMusicProviderImpl
import com.tech.starplayer.model.MusicRepository
import com.tech.starplayer.model.MusicRepositoryImpl
import dagger.Module
import dagger.Provides

@Module
object MusicProviderModule {

    @JvmStatic
    @Provides
    fun provideLocalMusicImpl(application: Application): LocalMusicProvider {
        return LocalMusicProviderImpl(application.contentResolver)
    }

    @JvmStatic
    @Provides
    fun provideMusicRepository(
        webServiceApi: WebServiceApi,
        localMusicProvider: LocalMusicProvider
    ): MusicRepository {
        return MusicRepositoryImpl(localMusicProvider, webServiceApi)
    }
}