package com.example.tmdbmoviesapp.data.repository.movie.datasource

import com.example.tmdbmoviesapp.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}