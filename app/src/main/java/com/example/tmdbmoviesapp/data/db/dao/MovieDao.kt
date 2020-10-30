package com.example.tmdbmoviesapp.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tmdbmoviesapp.data.model.movie.Movie

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovies(movies: List<Movie>)

    @Query("DELETE FROM popular_movies_table")
    suspend fun deleteAllMovies()

    @Query("SELECT * FROM popular_movies_table")
    suspend fun getMovies() :List<Movie>

}