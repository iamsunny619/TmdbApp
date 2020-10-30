package com.example.tmdbmoviesapp.data.repository.tvshow.dataSourceimpl

import com.example.tmdbmoviesapp.data.api.TmdbService
import com.example.tmdbmoviesapp.data.model.tvShow.TVShowList
import com.example.tmdbmoviesapp.data.repository.tvshow.datasource.TvRemoteDataSource
import retrofit2.Response

class TvRemoteDataSourceImpl(private val tmdbService: TmdbService, private val apiKey: String) :
    TvRemoteDataSource {
    override suspend fun getTvShow(): Response<TVShowList> {
        return tmdbService.getPopularTvShow(apiKey)
    }
}