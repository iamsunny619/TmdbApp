package com.example.tmdbmoviesapp.data.repository.tvshow.dataSourceimpl

import com.example.tmdbmoviesapp.data.model.tvShow.TVShow
import com.example.tmdbmoviesapp.data.repository.tvshow.datasource.TvCacheDataSource

class TvCacheDataSourceImpl : TvCacheDataSource {
    private var tvShowList = ArrayList<TVShow>()

    override suspend fun getTvShowFromCache(): List<TVShow> {
        return tvShowList
    }

    override suspend fun saveTvToCache(tvShow: List<TVShow>) {
        tvShowList.clear()
        tvShowList = ArrayList(tvShow)
    }


}