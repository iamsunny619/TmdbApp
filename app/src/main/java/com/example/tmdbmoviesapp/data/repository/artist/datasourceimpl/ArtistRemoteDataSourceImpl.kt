package com.example.tmdbmoviesapp.data.repository.artist.datasourceimpl

import com.example.tmdbmoviesapp.data.api.TmdbService
import com.example.tmdbmoviesapp.data.model.artist.ArtisList
import com.example.tmdbmoviesapp.data.repository.artist.datasource.ArtistRemoteDataSource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(private val tmdbService: TmdbService, private val apiKey: String) :
    ArtistRemoteDataSource {
    override suspend fun getArtist(): Response<ArtisList> {
        return tmdbService.getPopularArtist(apiKey)
    }


}