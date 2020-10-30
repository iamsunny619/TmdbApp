package com.example.tmdbmoviesapp.domain.tvshow.repository

import com.example.tmdbmoviesapp.data.model.tvShow.TVShow

interface TvShowRepository {

    suspend fun getTvShow(): List<TVShow>?
    suspend fun updateTvShow(): List<TVShow>?
}