package com.example.tmdbmoviesapp.domain.tvshow.useCase

import com.example.tmdbmoviesapp.data.model.tvShow.TVShow
import com.example.tmdbmoviesapp.domain.tvshow.repository.TvShowRepository

class GetTvShowUseCase(val tvShowRepository: TvShowRepository) {

    suspend fun excecute(): List<TVShow>? = tvShowRepository.getTvShow()
}