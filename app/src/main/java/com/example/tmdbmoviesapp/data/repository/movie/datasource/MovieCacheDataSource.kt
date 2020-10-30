package com.example.tmdbmoviesapp.data.repository.movie.datasource

import com.example.tmdbmoviesapp.data.model.movie.Movie

interface MovieCacheDataSource {

    suspend fun getMoviesFromCache(): List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)
}