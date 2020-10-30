package com.example.tmdbmoviesapp.data.repository.tvshow.datasource

import com.example.tmdbmoviesapp.data.model.tvShow.TVShow

interface TvLocalDataSource {
    suspend fun getTvShowFromDB(): List<TVShow>
    suspend fun saveTvToDB(tvShow: List<TVShow>)
    suspend fun clearAllTvShow()
}