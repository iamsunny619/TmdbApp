package com.example.tmdbmoviesapp.data.repository.artist.datasource

import com.example.tmdbmoviesapp.data.model.artist.ArtisList
import retrofit2.Response

interface ArtistRemoteDataSource {
    suspend fun getArtist(): Response<ArtisList>
}