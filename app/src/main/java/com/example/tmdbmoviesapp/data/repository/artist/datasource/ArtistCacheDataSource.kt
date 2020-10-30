package com.example.tmdbmoviesapp.data.repository.artist.datasource

import com.example.tmdbmoviesapp.data.model.artist.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistFromCache(): List<Artist>
    suspend fun saveArtistToCache(artist: List<Artist>)
}