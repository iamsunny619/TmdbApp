package com.example.tmdbmoviesapp.domain.tvshow.useCase

import com.example.tmdbmoviesapp.data.model.tvShow.TVShow
import com.example.tmdbmoviesapp.domain.tvshow.repository.TvShowRepository

class UpdateTvShowUseCase(val tvShowRepository: TvShowRepository) {
    suspend fun execute(): List<TVShow>? = tvShowRepository.updateTvShow()
}