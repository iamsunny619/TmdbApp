package com.example.tmdbmoviesapp.data.repository.movie

import com.example.tmdbmoviesapp.data.api.TmdbService
import com.example.tmdbmoviesapp.data.model.movie.MovieList
import com.example.tmdbmoviesapp.data.repository.movie.datasource.MovieRemoteDataSource
import retrofit2.Response

class RemoteDataSourceImpl(private val tmdbService: TmdbService, private val apiKey: String) :
    MovieRemoteDataSource {

    override suspend fun getMovies(): Response<MovieList> {
        return tmdbService.getPopularMovies(apiKey)
    }
}