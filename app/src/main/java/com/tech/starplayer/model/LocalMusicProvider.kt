package com.tech.starplayer.model

interface LocalMusicProvider {

    suspend fun getAllMusic() : List<MusicRepoModel>
}