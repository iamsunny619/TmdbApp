package com.example.tmdbmoviesapp.domain.movie.useCase

import com.example.tmdbmoviesapp.data.model.movie.Movie
import com.example.tmdbmoviesapp.domain.movie.repository.MovieRepository

class UpdateMovieUseCase(val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>? = movieRepository.updateMovies()
}