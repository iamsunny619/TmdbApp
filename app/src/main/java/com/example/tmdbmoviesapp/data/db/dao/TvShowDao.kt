package com.example.tmdbmoviesapp.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tmdbmoviesapp.data.model.tvShow.TVShow

@Dao
interface TvShowDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTvShow(tvShowList: List<TVShow>)

    @Query("DELETE FROM popular_tvshow_table")
    suspend fun deleteAllTvShows()

    @Query("SELECT * FROM popular_tvshow_table")
    suspend fun getTvShow(): List<TVShow>

}