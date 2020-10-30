package com.example.tmdbmoviesapp.data.repository.tvshow

import android.util.Log
import com.example.tmdbmoviesapp.data.model.tvShow.TVShow
import com.example.tmdbmoviesapp.data.repository.tvshow.datasource.TvCacheDataSource
import com.example.tmdbmoviesapp.data.repository.tvshow.datasource.TvLocalDataSource
import com.example.tmdbmoviesapp.data.repository.tvshow.datasource.TvRemoteDataSource
import com.example.tmdbmoviesapp.domain.tvshow.repository.TvShowRepository

class TvShowRepositoryImpl(
    private val tvShowRemoteDataSource: TvRemoteDataSource,
    private val tvShowLocalDataSource: TvLocalDataSource,
    private val tvShowCacheDataSource: TvCacheDataSource
) : TvShowRepository {
    override suspend fun getTvShow(): List<TVShow>? {
        TODO("Not yet implemented")
    }

    override suspend fun updateTvShow(): List<TVShow>? {
        TODO("Not yet implemented")
    }

    suspend fun getTvShowFromApi(): List<TVShow>? {
        var tvShowList: List<TVShow>? = null

        try {
            val response = tvShowRemoteDataSource.getTvShow()
            val body = response.body()
            if (body != null) {
                tvShowList = body.TVShows
            }
        } catch (e: Exception) {
            Log.i("TvRepoImpl", e.toString())
        }
        return tvShowList
    }

    suspend fun getTvShowFromDB(): List<TVShow>? {
        var tvShowlist: List<TVShow>? = null
        try {
            tvShowlist = tvShowLocalDataSource.getTvShowFromDB()
        } catch (e: Exception) {
            Log.i("TvRepoImpl", e.toString())
        }
        if (tvShowlist?.size!! > 0) {
            return tvShowlist
        } else {
            tvShowlist = getTvShowFromApi()
            tvShowLocalDataSource.saveTvToDB(tvShowlist!!)
        }
        return tvShowlist
    }

    suspend fun getTvShowFromCache(): List<TVShow>? {
        var tvShowlist: List<TVShow>? = null
        try {
            tvShowlist = tvShowCacheDataSource.getTvShowFromCache()
        } catch (e: Exception) {
            Log.i("TvRepoImpl", e.toString())
        }
        if (tvShowlist?.size!! > 0) {
            return tvShowlist
        } else {
            tvShowlist = getTvShowFromDB()
            tvShowCacheDataSource.saveTvToCache(tvShowlist!!)
        }
        return tvShowlist
    }


}