package com.example.tmdbmoviesapp.data.repository.tvshow.dataSourceimpl

import com.example.tmdbmoviesapp.data.db.dao.TvShowDao
import com.example.tmdbmoviesapp.data.model.tvShow.TVShow
import com.example.tmdbmoviesapp.data.repository.tvshow.datasource.TvLocalDataSource

class TvLocalDataSourceImpl(private val tvShowDao: TvShowDao, private val apiKey: String) :
    TvLocalDataSource {
    override suspend fun getTvShowFromDB(): List<TVShow> {
        return tvShowDao.getTvShow()
    }

    override suspend fun saveTvToDB(tvShow: List<TVShow>) {
        return tvShowDao.saveTvShow(tvShow)
    }

    override suspend fun clearAllTvShow() {
        return tvShowDao.deleteAllTvShows()
    }

}