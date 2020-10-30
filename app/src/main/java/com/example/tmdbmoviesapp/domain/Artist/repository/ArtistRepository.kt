package com.example.tmdbmoviesapp.domain.Artist.repository

import com.example.tmdbmoviesapp.data.model.artist.Artist

interface ArtistRepository {

    suspend fun getArtist(): List<Artist>?
    suspend fun updateArtist(): List<Artist>?
}