package com.example.tmdbmoviesapp.data.repository.tvshow.datasource

import com.example.tmdbmoviesapp.data.model.tvShow.TVShowList
import retrofit2.Response

interface TvRemoteDataSource {
    suspend fun getTvShow():Response<TVShowList>

}