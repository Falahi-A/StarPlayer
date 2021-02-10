package com.tech.starplayer.di.components

import com.tech.starplayer.di.FragmentScope
import com.tech.starplayer.view.PlayerFragment
import dagger.Component
@FragmentScope
@Component(dependencies = [AppComponent::class])
interface PlayerComponent {

    fun inject(playerFragment: PlayerFragment)

    @Component.Builder
    interface Builder {

        fun build(): PlayerComponent

        fun appComponent(appComponent: AppComponent): Builder

    }
}