package com.example.tmdbmoviesapp.data.repository.artist.datasource

import com.example.tmdbmoviesapp.data.model.artist.Artist

interface ArtistLocalDataSource {
    suspend fun getArtistFromDB(): List<Artist>
    suspend fun saveArtistToDB(movie: List<Artist>)
    suspend fun clearAll()
}