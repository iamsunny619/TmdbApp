package com.example.tmdbmoviesapp.domain.movie.useCase

import com.example.tmdbmoviesapp.data.model.movie.Movie
import com.example.tmdbmoviesapp.domain.movie.repository.MovieRepository

class GetMovieUseCase(private val movieRepository: MovieRepository) {

    suspend fun excecute(): List<Movie>? = movieRepository.getMovies()
}