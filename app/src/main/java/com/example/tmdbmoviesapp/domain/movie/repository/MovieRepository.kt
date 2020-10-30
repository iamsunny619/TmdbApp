package com.example.tmdbmoviesapp.domain.movie.repository

import com.example.tmdbmoviesapp.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}