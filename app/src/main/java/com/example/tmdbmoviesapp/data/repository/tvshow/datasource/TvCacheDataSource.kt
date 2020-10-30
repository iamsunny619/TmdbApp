package com.example.tmdbmoviesapp.data.repository.tvshow.datasource

import com.example.tmdbmoviesapp.data.model.tvShow.TVShow

interface TvCacheDataSource {

    suspend fun getTvShowFromCache(): List<TVShow>
    suspend fun saveTvToCache(tvShow: List<TVShow>)
}