package com.tech.starplayer.di.components

import com.tech.starplayer.di.FragmentScope
import com.tech.starplayer.di.modules.MusicProviderModule
import com.tech.starplayer.di.modules.ViewModelModule
import com.tech.starplayer.view.musics_list.MusicsListFragment
import dagger.Component


@FragmentScope
@Component(
    dependencies = [AppComponent::class],
    modules = [ViewModelModule::class, MusicProviderModule::class]
)
interface MusicListComponent {

    fun inject(musicsListFragment: MusicsListFragment)

    @Component.Builder
    interface Builder {
        fun build(): MusicListComponent


        fun appComponent(appComponent: AppComponent): Builder


    }
}