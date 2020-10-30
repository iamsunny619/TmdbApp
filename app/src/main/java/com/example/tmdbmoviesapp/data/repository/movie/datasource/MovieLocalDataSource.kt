package com.example.tmdbmoviesapp.data.repository.movie.datasource

import com.example.tmdbmoviesapp.data.model.movie.Movie

interface MovieLocalDataSource {

    suspend fun getMoviesFromDB(): List<Movie>
    suspend fun saveMoviesToDB(movie: List<Movie>)
    suspend fun clearAll()
}