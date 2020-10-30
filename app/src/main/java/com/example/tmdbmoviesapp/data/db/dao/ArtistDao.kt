package com.example.tmdbmoviesapp.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tmdbmoviesapp.data.model.artist.Artist

@Dao
interface ArtistDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveArtist(artist: List<Artist>)

    @Query("DELETE FROM popular_artists_table")
    suspend fun deleteAllArtist()

    @Query("SELECT * FROM popular_artists_table")
    suspend fun getArtist(): List<Artist>
}